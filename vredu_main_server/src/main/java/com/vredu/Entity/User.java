package com.vredu.Entity;

public class User 
{
	private int id;
	private String user_name;
	private String password;
	private String name;
	private String student_id;
	private String gender;
	private String email;
	private String telephone;
	
	public User()
	{
		super();
	}
	
	//增加username，password，email三个参数的构造器，为注册功能提供实例化方法
	public User(String user_name, String password, String email) {
		this.user_name = user_name;
		this.password = password;
		this.email = email;
	}
	
	public int getId() { 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return user_name;
	}

	public void setUsername(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
      

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      
	public String getStudentId() {
		return student_id;
	}

	public void setStudentId(String student_id) {
		this.student_id=student_id;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	
	
}

