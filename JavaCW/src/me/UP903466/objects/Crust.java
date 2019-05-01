package me.UP903466.objects;

public enum Crust {
	
	/*
	 * The type of crust that is to be included with
	 * the pizza at hand
	 */
	
	// Enumerated type to show it's name and cost respectively
	THIN("Thin", 1.08), DEEP("Deep", 1.1), STUFFED("Stuffed", 2.14);
	
	private String name;
	private double cost;
	
	private Crust(String name, double cost) {
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
