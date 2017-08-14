package com.example.demo.models;

public class Calculation {
	//fields or instance variables
	private double first;
	private double second;
	
	//the constructor 
	public Calculation(int first, double second) {
			this.first = first;
			this.second = second;
	}
	
	public double addition() {
		double addition = first + second;
		return addition;
	}
	
	public double subtraction() {
		double subtraction = first - second;
		return subtraction;
	}
	
	public double multiplication() {
		double multiplication = first * second;
		return multiplication;
	}
	
	public double divide() {
		double divide = first / second;
		return divide;
	}
	
	public double modulus() {
		double modulus = first % second;
		return modulus;
	}
	
	public double exponent() {
		double exponent = Math.pow(first, second);
		return exponent;
	}
}