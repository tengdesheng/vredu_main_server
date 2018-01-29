package com.vredu.Entity;

public class Course_USer {
  private int id;
  private String user_name;
  private String course_name;
  
  public String getUserName() {
	   return user_name;
  }
  
  public void setUserName(String user_name) {
	   this.user_name=user_name;
  }
  
  public String getCourseName() {
	  return course_name;
	  
  }
  public void setCourseName(String course_name) {
	  this.course_name=course_name;
  }
}
