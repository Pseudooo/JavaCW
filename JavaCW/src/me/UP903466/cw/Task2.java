package me.UP903466.cw;

import java.util.UUID;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Order;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class Task2 {
	
	public static void main(String[] args) {
		
		// Instantiate some pizzas for testing purposes
		
		Pizza pizza1 = new Pizza(
				Size.MEDIUM,
				Crust.THIN,
				Sauce.PESTO,
				Topping.EXTRA_CHEESE,
				Topping.CHILLI
			);
		
		Pizza pizza2 = new Pizza(
				Size.MEDIUM,
				Crust.STUFFED,
				Sauce.PESTO,
				Topping.OLIVES,
				Topping.ONION
			);
		
		Pizza pizza3 = new Pizza(
				Size.SMALL,
				Crust.THIN,
				Sauce.PESTO,
				Topping.CHILLI,
				Topping.PEPPERONI
			);
		
		Pizza pizza4 = new Pizza(
				Size.SMALL,
				Crust.THIN,
				Sauce.PESTO,
				Topping.OLIVES,
				Topping.OLIVES
			);
		
		// Instantiate the order
		Order MyOrder = new Order();
		
		// Add all of the pizzas
		MyOrder.addPizza(pizza1);
		MyOrder.addPizza(pizza2);
		MyOrder.addPizza(pizza3);
		MyOrder.addPizza(pizza4);
		
		// Print to demonstrate all pizzas in the order
		System.out.println("TEST CASE #1 ============ ADDING PIZZAS"); 
		System.out.println(MyOrder);
		
		UUID PizzaID = pizza3.getID();
		
		MyOrder.removePizza(pizza1);
		MyOrder.removePizza(PizzaID);
		
		// Print to demonstrate removals
		System.out.println("TEST CASE #2 ============== REMOVING PIZZAS");
		System.out.println(MyOrder);
		
		UUID PizzaToEdit = pizza2.getID();
		
		MyOrder.updatePizza(PizzaToEdit, new Pizza(Size.SMALL, 
				Crust.THIN, Sauce.TOMATO, Topping.ANCHOVY, Topping.ONION));
		
		System.out.println("TEST CASE #3 ============== UPDATING PIZZAS");
		System.out.println(MyOrder);
		
	}
	
}
