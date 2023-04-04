package com.example.roomwebapp.models;

public class Staff {
	private long id;
	private String name;
	private String position;
	
	public Staff() {
		
	}
	
	public Staff(long id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
