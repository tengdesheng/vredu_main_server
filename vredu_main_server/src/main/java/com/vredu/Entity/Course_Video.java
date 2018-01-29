package com.vredu.Entity;

public class Course_Video {
	private int id;
    private String course_name;
    private String course_chapter_number;
    private String course_section_number;
    private String course_video_url;
    private String course_video_name;
    
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
    
    public String getCourseSectionNumber(){
 	   return course_section_number;
 	   
    }
    public void setCourseSectionNumber(String course_section_number) {
 	   this.course_section_number=course_section_number;
    }
    
    public String getCourseVideoUrl() {
    	return course_video_url;
    }
    
    public void setCourseVideoUrl(String course_video_url) {
       this.course_video_url=course_video_url;
    }
    
    public String getCourseVideoName() {
    	return course_video_name;
    }
    
    public void setCourseVideoName(String course_video_name) {
       this.course_video_name=course_video_name;
    }
}


