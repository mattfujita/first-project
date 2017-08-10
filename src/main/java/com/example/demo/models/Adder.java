package com.example.demo.models;

public class Adder {
	//fields or instance variables
	private double sum;
	
	//the constructor 
	public Adder(int first, double second) {
		sum = first + second;
	}
	
	public double calculate() {
		return sum;
	}
}
