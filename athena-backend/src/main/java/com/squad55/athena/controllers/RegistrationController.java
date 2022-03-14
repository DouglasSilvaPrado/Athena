package com.squad55.athena.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad55.athena.dto.CourseDTO;


@RestController
@RequestMapping(value = "/registration")
public class RegistrationController {
	
	
	@GetMapping
	public CourseDTO saveRegistration(@PathVariable Long id){
		return null;
	}
}
