package com.vredu.Entity;

public class Course {
	private int id;
	private String course_name;
	private String course_teacher;
	private String course_describe;
	private String course_image;
	private String course_exam_standard;
	private String course_data;
	
	
	public int getCourseId() {
		return id;
	}
	public void setCourseId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return course_name;
	}
	public void setCourseName(String course_name) {
		this.course_name = course_name;
	}
	
	public String getCourseTeacher() {
		return course_teacher;
	}
	public void setCourseTeacher(String course_teacher) {
		this.course_teacher=course_teacher;
		
	}
	
	public String getCourseDescribe() {
		return course_describe;
	}
	public void setCourseDescribe(String course_describe) {
		this.course_describe=course_describe;
	}
	
	public String getCourseImage() {
		return course_image;
	}
	public void setCourseImage(String course_image) {
		this.course_image=course_image;
	}
	
	public String getCourseExamStandard(){
		return course_exam_standard;
	}
	public void setCourseExamStandard(String course_exam_standard) {
		this.course_exam_standard=course_exam_standard;
	}
	
	public String getCourseData(){
		return course_data;
	}
	public void setCourseData(String course_data) {
		this.course_data=course_data;
	}
	
	
}
