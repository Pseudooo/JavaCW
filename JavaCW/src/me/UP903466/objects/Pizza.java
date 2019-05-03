package me.UP903466.objects;

import java.util.UUID;

public class Pizza {
	
	private Size size; // Member variables
	private Crust crust;
	private Sauce sauce;
	private Topping topping1, topping2;
	private final UUID id;
	
	// Constructor that will initialize all member variables
	public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2) {
		this.size = size;
		this.crust = crust;
		this.sauce = sauce;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.id = UUID.randomUUID(); // Cryptographically secure (Extremely unlikely to clash)
	}
	
	// ******************************************* START OF GETTERS
	
	// Return the total cost of the pizza
	public double getTotalCost() {
		return this.size.getCost() +
				this.crust.getCost() +
				this.sauce.getCost() +
				this.topping1.getCost() * 5 + 
				this.topping2.getCost() * 4;
	}
	
	// Return the cost of just the base
	public double getBaseCost() {
		return this.size.getCost() + this.crust.getCost();
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public Crust getCrust() {
		return this.crust;
	}
	
	public Sauce getSauce() {
		return this.sauce;
	}
	
	public Topping getTopping1() {
		return this.topping1;
	}
	
	public Topping getTopping2() {
		return this.topping2;
	}
	
	public UUID getID() {
		return this.id;
	}
	
	// ********************************************* END OF GETTERS
	
	// ********************************************* SETTERS
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public void setCrust(Crust crust) {
		this.crust = crust;
	}
	
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	
	public void setTopping1(Topping topping) {
		this.topping1 = topping;
	}
	
	public void setTopping2(Topping topping) {
		this.topping2 = topping;
	}
	
	// ********************************************* END OF SETTERS
	
	/*
	 * Override the native toString function for this object
	 */
	@Override
	public String toString() {
		return String.format(
				"TOTAL COST: £%.2f%n%s Size: £%.2f%n%s Crust: £%.2f\nBASE COST: £%.2f%n%s "
				+ "Topping: 5 * £%.2f = £%.2f%n%s Topping: 4 * %.2f = £%.2f%n%s Sauce: £%.2f",
				this.getTotalCost(),
				this.getSize().toString(),
				this.getSize().getCost(),
				this.getCrust().toString(),
				this.getCrust().getCost(),
				this.getBaseCost(),
				this.getTopping1().toString(),
				this.getTopping1().getCost(),
				this.getTopping1().getCost() * 5,
				this.getTopping2().toString(),
				this.getTopping2().getCost(),
				this.getTopping2().getCost() * 4,
				this.getSauce().toString(),
				this.getSauce().getCost()
			);
	}
	
	/*
	 * Override both equals and hashcode for extended
	 * list functionality
	 */
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Pizza) {
			Pizza other = (Pizza) object;
			
			return this.id.equals(other.id);
			
		}else return false;
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
}
