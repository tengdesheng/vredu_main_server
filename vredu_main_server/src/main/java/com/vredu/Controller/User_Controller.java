package com.vredu.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.vredu.Config.WebSecurityConfig;
import com.vredu.Dao.User_Dao;
import com.vredu.Entity.User;

@Controller        
@CrossOrigin(origins="*")  
public class User_Controller {
	@Autowired
    User_Dao user_dao;
	
	//用户登录处理
	@RequestMapping(value = {"/loginHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginHandle(String username, String password, HttpSession session,
			HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();

		List<User> user = user_dao.verifyUser(username, password);
		if (user.size() == 0) {
			map.put("success", false);
			map.put("message", "登录失败");
			return map;
		}
		else {
			//新建cookie
			Cookie cookie=new Cookie(username,password);
			//设置cookie的有效期限是7天
			cookie.setMaxAge(7*24*60*60);
			response.addCookie(cookie);
			
			map.put("success", true);
			map.put("message", "登录成功");
			return map;
		}
	}
	
	
	//用户注销处理
	@RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
	public String logout(HttpServletResponse response,HttpServletRequest request) 
	throws ServletException,IOException{
		Cookie[] cookies=request.getCookies();
		Cookie cookie=null;
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				//遍历cookie
				cookie=cookies[i];
				String username=cookie.getName();
				String password=cookie.getValue();
				List<User> user=user_dao.verifyUser(username, password);
				if(user.size()!=0) {
					cookie.setValue(null);
					//设置cookie失效
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					
				}
			}
		}
		
		String url = "redirect:/login";
		return url;
	}
	
	
	//用户注册处理
	@RequestMapping(value = {"/registerHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> register(String username, String password, String email) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = new User(username, password, email);
		user_dao.register(user);
		
		List<User> find = user_dao.verifyUser(username, password);
		if (find.size() == 0) {
			map.put("success", false);
			map.put("message", "注册失败");
			
			return map;
		}
		else {
			map.put("success", true);
			map.put("message", "注册成功");
			
			return map;
		}
	}
	 
	
	//密码重置处理
	@RequestMapping(value = {"/resetHandle"}, method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> resetHandle(String username, String password, String newPassword) {
		Map<String, Object> map = new HashMap<String, Object>();
		user_dao.reset(username, password, newPassword);
		
		List<User> find = user_dao.verifyUser(username, newPassword);
		if (find.size() == 0) {
			map.put("success", false);
			map.put("message", "修改失败");
			
			return map;
		}
		else {
			map.put("success", true);
			map.put("message", "修改成功");
			
			return map;
		}
	}
}
