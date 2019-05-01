package me.UP903466.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Order;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class PizzaApp extends JFrame {

	private static final long serialVersionUID = 3463110150438682724L;

	private Order order;
	private PizzaPanel pane;
	
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
		this.order = new Order();
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		order.addPizza(new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY));
		
		this.pane = new PizzaPanel(this);
		
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		this.pane.addPizzaBox(new PizzaBox(this, new Pizza(Size.LARGE, Crust.DEEP, Sauce.PESTO, Topping.ANCHOVY, Topping.ANCHOVY)));
		
		this.add(this.pane);
		/*
		JScrollPane scrllPane = new JScrollPane(
					this.pane,
					JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		this.getContentPane().add(scrllPane);
		*/
		
		this.setVisible(true);
		
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public PizzaPanel getPizzaPanel() {
		return this.pane;
	}
	
}
