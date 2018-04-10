package com.valoyes.patterns.frontcontroller;

/**
 * Un Java VO es simplemente un Java Bean que transmitira informacion
 * a traves de los Java layers
 *
 */
public class StudentVO {
	
	private int id;
	private String name;
	
	public StudentVO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
