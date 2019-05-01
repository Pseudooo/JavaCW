package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;

public class DeletePizzaListener implements ActionListener {
	
	private final PizzaApp app;
	private final PizzaBox pizzaBox;
	
	public DeletePizzaListener(PizzaApp app, PizzaBox pizzaBox) {
		this.app = app;
		this.pizzaBox = pizzaBox;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.app.getPizzaPanel().removePizzaBox(this.pizzaBox);
		this.app.getOrder().removePizza(pizzaBox.getPizza().getID());
		
	}
	
}
