package com.vredu.Entity;

public class Course_Chapter {
   private int id;
   private String course_name;
   private String course_chapter_number;
   private String course_chapter_name;
   private String course_section_number;
   private String course_section_name;
   private String course_content;
   
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
   
   public String getCourseChapterNumber(){
	   return course_chapter_number;
	   
   }
   public void setCourseChapterNumber(String course_chapter_number) {
	   this.course_chapter_number=course_chapter_number;
   }
   
   public String getCourseChaptername(){
	   return course_chapter_name;
	   
   }
   public void setCourseChapterName(String course_chapter_name) {
	   this.course_chapter_name=course_chapter_name;
   }
   
   public String getCourseSectionNumber(){
	   return course_section_number;
	   
   }
   public void setCourseSectionNumber(String course_section_number) {
	   this.course_section_number=course_section_number;
   }
   
   
   public String getCourseSectionName(){
	   return course_section_name;
	   
   }
   public void setCourseSectionName(String course_section_name) {
	   this.course_section_name=course_section_name;
   }
   
   public String getCourseContent() {
	   return course_content;
   }
   
   public void setCourseContent(String course_content) {
	 this.course_content=course_content;  
   }
   
}
