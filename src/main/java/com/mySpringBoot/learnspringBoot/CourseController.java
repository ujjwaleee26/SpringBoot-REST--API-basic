package com.mySpringBoot.learnspringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController
{
	
	 @Autowired
	   private CourseRetrieveConfiguration config;
	@RequestMapping("/courses") //requestmap-url generation(onClick)
	public CourseRetrieveConfiguration retrieveAllCourses()
	{
		return config;

}
}
 