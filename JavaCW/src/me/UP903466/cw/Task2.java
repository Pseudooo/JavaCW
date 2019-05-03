package me.UP903466.cw;

import me.UP903466.objects.Crust;
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
		
	}
	
}
