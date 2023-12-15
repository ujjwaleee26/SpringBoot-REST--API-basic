package com.mySpringBoot.learnspringBoot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="course-retrieve")
@Component
public class CourseRetrieveConfiguration 
{
    private long ID;
    private String name;
    private String author;
	
    public long getID() {
		return ID;
	}
	public void setID(long iD) {
		this.ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	} 
	public void setAuthor(String author) {
		this.author = author;
	}
    
    
    
    
}
