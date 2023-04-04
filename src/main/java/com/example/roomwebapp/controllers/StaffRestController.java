package com.example.roomwebapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.roomwebapp.models.Staff;
import com.example.roomwebapp.service.StaffService;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {
	private final StaffService staffService;
	
	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<Staff> getAllStaffs() {
		return this.staffService.getAllStaffs();
	}
}
