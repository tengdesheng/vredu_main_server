package com.vredu.Entity;

public class Course_Notice {
	private int id;
	private String course_name;
	private String course_notice_title;
	private String course_notice_time;
	private String course_notice_publisher;
	private String course_notice_content;
	
	 public int getId() {
	 	   return id;
	   }
	 public void setId(int id) {
		 this.id=id;
	   	}
	    
	 public String getCourseName() {
		  return course_name;
	   }
	 public void setCourseName(String course_name) {
	   this.course_name=course_name;
	 	   
	   }
	    
	 public String getCourseNoticeTitle() {
		 return course_notice_title;
	 }
	 public void setCourseNoticeTitle(String course_notice_title) {
		 this.course_notice_title=course_notice_title;
	 }
	 
	 public String getCourseNoticeTime() {
		 return course_notice_time;
	 }
	 public void setCourseNoticeTime(String course_notice_time) {
		 this.course_notice_time=course_notice_time;
	 }
	 
	 public String getCourseNoticePublisher() {
		 return course_notice_publisher;
	 }
	 public void setCourseNoticePublisher(String course_notice_publisher) {
		 this.course_notice_publisher=course_notice_publisher;
	 }
	 
	 public String getCourseNoticeContent() {
		 return course_notice_content;
	 }
	 public void setCourseNoticeContent(String course_notice_content) {
		 this.course_notice_content=course_notice_content;
	 }
}
