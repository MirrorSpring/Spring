package com.springlec.base.model;

public class ODto {

	int id;
	String name;
	String title;
	
	public ODto() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ODto(int id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	
	
	
	
}
