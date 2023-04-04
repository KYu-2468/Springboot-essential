package com.example.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.roomwebapp.models.Staff;
import com.example.roomwebapp.service.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffController {
	private final StaffService staffService;
	
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public String getAllStaffs(Model model) {
		model.addAttribute("staffs", staffService.getAllStaffs());
		return "staffs";
	}
	

}
