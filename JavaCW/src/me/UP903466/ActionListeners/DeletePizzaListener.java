package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;

public class DeletePizzaListener implements ActionListener {
	
	private final PizzaApp app;
	private final PizzaBox pizzaBox;
	
	/**
	 * @param app
	 * The application that will have the pizza removed from it
	 * @param 
	 * pizzaBox the PizzaBox that is to be removed from the main
	 * interface
	 */
	public DeletePizzaListener(PizzaApp app, PizzaBox pizzaBox) {
		this.app = app;
		this.pizzaBox = pizzaBox;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.app.getPizzaPanel().removePizzaBox(this.pizzaBox);
		this.app.getOrder().removePizza(this.pizzaBox.getPizza().getID());
		this.app.updateOrderText();
		
	}
	
}
