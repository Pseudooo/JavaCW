package me.UP903466.cw;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Order;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class Task2 {
	
	public static void main(String[] args) {
		
		// Create and populate an order to test
		Order order = new Order();
		
		order.addPizza(new Pizza(
						Size.MEDIUM,
						Crust.THIN,
						Sauce.PESTO,
						Topping.EXTRA_CHEESE,
						Topping.CHILLI
					));
		
		order.addPizza(new Pizza(
						Size.MEDIUM,
						Crust.STUFFED,
						Sauce.PESTO,
						Topping.OLIVES,
						Topping.ONION
					));
		
		order.addPizza(new Pizza(
						Size.SMALL,
						Crust.THIN,
						Sauce.PESTO,
						Topping.CHILLI,
						Topping.PEPPERONI
					));
		
		order.addPizza(new Pizza(
						Size.SMALL,
						Crust.THIN,
						Sauce.PESTO,
						Topping.OLIVES,
						Topping.OLIVES
					));
		
		// Print the order
		System.out.println(order);
		
		// Put some padding between test cases
		System.out.println("\n\n\n");
		
		/*
		 * New instance of the object is created to demonstrate
		 * the overriding of hashcode and equals.
		 */
		Pizza pizza = new Pizza(
				Size.SMALL,
				Crust.THIN,
				Sauce.PESTO,
				Topping.OLIVES,
				Topping.OLIVES
			);
		
		// Demonstrate removal
		order.removePizza(pizza);
		
		// Output the updated order to show the pizza has been removed
		System.out.println(order);
		
	}
	
}
