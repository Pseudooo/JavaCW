package me.UP903466.objects;

import java.util.ArrayList;
import java.util.UUID;

public class Order {
	
	private ArrayList<Pizza> pizzas;
	
	public Order() { // Constructor inits pizza list
		this.pizzas = new ArrayList<Pizza>();
	}
	
	/*
	 * The ArrayList can be manipulated directly with provided
	 * methods as we've overwritten equals and hashCode within our Pizza object.
	 */
	
	public void addPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}
	
	public boolean orderContains(Pizza pizza) {
		return this.pizzas.contains(pizza);
	}
	
	public boolean orderContains(UUID id) {
		for(Pizza p : this.pizzas) {
			if(p.getID().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public void removePizza(Pizza pizza) {
		this.removePizza(pizza);
	}
	
	public void removePizza(UUID id) {
		int index = this.getIndex(id);
		if(index != -1) this.pizzas.remove(index);
	}
	
	private int getIndex(UUID id) {
		int index = -1;
		for(int i = 0; i < this.pizzas.size(); i++) {
			if(this.pizzas.get(i).getID().equals(id)) {
				index = i;
			}
		}
		return index;
	}
	
	public void clear() {
		this.pizzas.clear();
	}
	
	public int size() {
		return this.pizzas.size();
	}
	
	/**
	 * @param id
	 * The ID of the pizza within the order to be updated
	 * @param pizza
	 * The pizza that the existing should be updated with
	 */
	public void updatePizza(UUID id, Pizza pizza) {
		int index = this.getIndex(id);
		if(index != -1) this.pizzas.set(index, pizza);
	}
	
	/*
	 * Override the toString method in order to provide
	 * string output for the order.
	 */
	
	@Override
	public String toString() {
		String format = "";
		
		for(Pizza pizza : this.pizzas.subList(0, this.pizzas.size() - 2)) {
			format += pizza.toString()+"\n\n";
		}
		
		format += this.pizzas.get(this.pizzas.size() - 1).toString();
		
		return format;
	}
	
	public double getTotalCost() {
		double cost = 0;
		
		for(Pizza p : this.pizzas) {
			cost += p.getTotalCost();
		}
		
		return cost;
	}
	
}
