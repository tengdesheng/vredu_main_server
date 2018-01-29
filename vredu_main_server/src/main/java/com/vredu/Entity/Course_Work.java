package com.vredu.Entity;

public class Course_Work {
       
	private int id;
	private String course_name;
	private String course_chapter_number;
	private String course_section_number;
	private String course_work_id;
	private String course_work_question;
	private String course_work_option;
	private String course_work_solution;
	
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
	
	public String getCourseChapterNumber(){
		   return course_chapter_number;
		   
	}
	public void setCourseChapterNumber(String course_chapter_number) {
		this.course_chapter_number=course_chapter_number;
	}
	
	 public String getCourseSectionNumber(){
		   return course_section_number;
		   
	}
	 public void setCourseSectionNumber(String course_section_number) {
		   this.course_section_number=course_section_number;
    }
	 
	public String getCourseWorkQuestion() {
		return course_work_question;
	}
	
	public void setCourseWorkQuestion(String course_work_question) {
		this.course_work_question=course_work_question;
	}
	
	
	public String getCourseWorkOption() {
		return course_work_option;
	}
	
	public void setCourseWorkOption(String course_work_option) {
		this.course_work_option=course_work_option;
	}
	
	public String getCourseWorkSolution() {
		return course_work_solution;
	}
	
	public void setCourseWorkSolution(String course_work_solution) {
		this.course_work_solution=course_work_solution;
	}
	
	public String getCourseWorkId() {
		return course_work_id;
	}
	
	public void setCourseWorkId(String course_work_id) {
		this.course_work_id=course_work_id;
	}
	
}
