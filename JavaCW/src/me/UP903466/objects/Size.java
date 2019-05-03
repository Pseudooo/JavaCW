package me.UP903466.objects;

public enum Size {
	
	/*
	 * The size of the pizza at hand and the respective
	 * price
	 */
	
	// Enumerated type of the size, containing the name and price respectively
	SMALL("Small", 9.45), MEDIUM("Medium", 11.87), LARGE("Large", 15.9);
	
	private final String name;
	private final double cost;
	
	private Size(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
