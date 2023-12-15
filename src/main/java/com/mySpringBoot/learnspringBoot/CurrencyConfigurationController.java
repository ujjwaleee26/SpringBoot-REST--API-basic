package com.mySpringBoot.learnspringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController
{
   @Autowired
   private CurrencyServiceConfiguration config;
   
   @RequestMapping("/github")
    public CurrencyServiceConfiguration retrieveAllCourses()
    {
	   return config;
    }
    
    
}
