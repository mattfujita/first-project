package com.example.demo.models;

public class Calculation {
	//fields or instance variables
	private double addition;
	private double subtraction;
	private double multiplication;
	private double divide;
	private double modulus;
	private double exponent;
	
	//the constructor 
	public Calculation(int first, double second) {
			addition = first + second;
			subtraction = first - second;
			multiplication = first * second;
			divide = first / second;
			modulus = first % second;
			exponent = Math.pow(first, second);
	}
	
	public double addition() {
		return addition;
	}
	
	public double subtraction() {
		return subtraction;
	}
	
	public double multiplication() {
		return multiplication;
	}
	
	public double divide() {
		return divide;
	}
	
	public double modulus() {
		return modulus;
	}
	
	public double exponent() {
		return exponent;
	}
}