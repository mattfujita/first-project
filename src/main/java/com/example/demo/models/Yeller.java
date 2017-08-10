package com.example.demo.models;

public class Yeller {
	private String message;
	
	public Yeller(String message) {
		this.message = message;
	}

	public String allCaps() {
		return this.message.toUpperCase();
	}
}
