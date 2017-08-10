package com.example.demo.models;

public class Whisper {
	private String message;
	
	public Whisper(String message) {
		this.message = message;
	}

	public String allLower() {
		return this.message.toLowerCase();
	}
}
