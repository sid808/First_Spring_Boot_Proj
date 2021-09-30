package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.
Autowired;

@Component
//@Scope(value="prototype")
public class Alien {

	private int aid;
	private String aname;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	// constructor
	public Alien() {
		super();
		System.out.println("object created ...");
	}
	
	// getters and setters
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	//methods
	public void show() {
		System.out.println("Inside show...");
		laptop.compile();
	}
	
}
