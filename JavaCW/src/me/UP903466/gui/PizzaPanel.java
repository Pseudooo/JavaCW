package me.UP903466.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class PizzaPanel extends JComponent {
	
	private static final long serialVersionUID = 1L;

	public PizzaPanel() {
		
		this.setLayout(new FlowLayout());
		
		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK), "Your Order:"));
		
	}
	
	public void removePizzaBox(PizzaBox pizzaBox) {
		this.remove(pizzaBox);
	}
	
	public void addPizzaBox(PizzaBox pizzaBox) {
		this.add(pizzaBox);
	}
	
}
