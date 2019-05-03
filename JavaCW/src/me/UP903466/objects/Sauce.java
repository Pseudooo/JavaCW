package me.UP903466.objects;

public enum Sauce {
	
	/*
	 * The type of sauce that is to be included with
	 * the pizza at hand
	 */
	
	// Enumerated type for sauces with their names and prices respectively
	TOMATO("Tomato", 0.0), PESTO("Pesto", 0.5);
	
	private final String name;
	private final double cost;
	
	private Sauce(String name, double cost) {
		this.cost = cost;
		this.name = name;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
