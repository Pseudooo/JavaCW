package me.UP903466.gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Order;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class PizzaApp extends JFrame {

	private static final long serialVersionUID = 3463110150438682724L;

	public PizzaApp() {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(Exception e) {
			System.err.println("An error has occurred with the look at feel!");
			e.printStackTrace();
		}
		
		// Setup window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pizzas");
		this.setSize(1000, 800);
		this.setResizable(false);
		//this.setLayout(new GridLayout(0, 2));
		
		// Order that will be used internally to track pizzas
		Order order = new Order();
		
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
					),
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
		
		PizzaPanel pp = new PizzaPanel();
		
		for(Pizza pizza : pizzas) {
			PizzaBox pb = new PizzaBox(pizza);
			pp.add(pb);
		}
		
		this.getContentPane().add(pp);
		
		this.setVisible(true);
		
	}
	
}
