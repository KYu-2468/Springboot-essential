package com.example.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.roomwebapp.models.Staff;

@Service
public class StaffService {
	private static final List<Staff> staffs = new ArrayList<>();
	static {
		for (int i = 0; i < 10; i++) {
			staffs.add(new Staff(i, "Staff Name-" + i, "Staff Position-" + i));
		}
	}
	
	public List<Staff> getAllStaffs() {
		return staffs;
	}
}
