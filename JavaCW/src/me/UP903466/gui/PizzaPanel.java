package me.UP903466.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PizzaPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public PizzaPanel(PizzaApp app) {
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.BLACK), "<html><h2>Your Order</h2></html>"));
		
	}
	
	public void removePizzaBox(PizzaBox pizzaBox) {
		this.remove(pizzaBox);
		this.update();
	}
	
	public void addPizzaBox(PizzaBox pizzaBox) {
		this.add(pizzaBox);
		this.update();
	}
	
	public void clear() {
		this.removeAll();
		this.update();
	}
	
	private void update() {
		this.revalidate();
		this.repaint();
	}
	
}
