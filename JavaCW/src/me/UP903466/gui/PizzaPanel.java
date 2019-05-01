package me.UP903466.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class PizzaPanel extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	private final PizzaApp app;

	public PizzaPanel(PizzaApp app) {
		
		this.setLayout(new FlowLayout());
		
		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK), "Your Order:"));
		
		
		this.app = app;
		
	}
	
	public void removePizzaBox(PizzaBox pizzaBox) {
		this.remove(pizzaBox);
		this.update();
	}
	
	public void addPizzaBox(PizzaBox pizzaBox) {
		this.add(pizzaBox);
		this.update();
	}
	
	public PizzaApp getApp() {
		return this.app;
	}
	
	private void update() {
		this.revalidate();
		this.repaint();
	}
	
}
