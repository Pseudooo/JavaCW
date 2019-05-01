package me.UP903466.objects;

public enum Topping {
	
	// Enumerated type for toppings containing name and price respectively
	NONE("None", 0.0), OLIVES("Olives", 0.08), EXTRA_CHEESE("Extra Cheese", 0.02), CHILLI("Chilli", 0.06),
	PEPPERONI("Pepperoni", 0.1), MUSHROOM("Mushroom", 0.03), ROCKET("Rocket", 0.05), JALAPEÑOS("Jalapeños", 0.2),
	ONION("Onion", 0.07), ANCHOVY("Anchovy", 0.09);
	
	private String name;
	private double cost;
	
	private Topping(String name, double cost) {
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
