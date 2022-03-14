package com.squad55.athena.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squad55.athena.dto.CourseDTO;
import com.squad55.athena.services.CourseService;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
	
	@Autowired
	private CourseService service;

	public Page<CourseDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
}
