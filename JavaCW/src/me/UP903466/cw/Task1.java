package me.UP903466.cw;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class Task1 {
	public static void main(String[] args) {
		
		/*
		 * Init an array that contains all of the pizzas that are shown
		 * in the test data in order to demonstrate that the system works
		 * appropriately.
		 */
		Pizza[] pizzas = {
				new Pizza(
						Size.MEDIUM,
						Crust.THIN,
						Sauce.PESTO,
						Topping.EXTRA_CHEESE,
						Topping.CHILLI
					),
				new Pizza(
						Size.MEDIUM,
						Crust.STUFFED,
						Sauce.PESTO,
						Topping.OLIVES,
						Topping.ONION
					),
				new Pizza(
						Size.SMALL,
						Crust.THIN,
						Sauce.PESTO,
						Topping.CHILLI,
						Topping.PEPPERONI
					),
				new Pizza(
						Size.SMALL,
						Crust.THIN,
						Sauce.PESTO,
						Topping.OLIVES,
						Topping.OLIVES
					)
		};
		
		// Enumerate through list printing each pizza
		for(int i = 0; i < 4; i++) {
			System.out.printf("-----=====[Pizza #%d]=====-----%n%n", i+1);
			System.out.printf(pizzas[i]+"%n%n");
		}
		
	}
}
