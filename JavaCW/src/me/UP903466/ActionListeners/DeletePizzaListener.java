package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.PizzaBox;

public class DeletePizzaListener implements ActionListener {
	
	private final PizzaBox pizzaBox;
	
	public DeletePizzaListener(PizzaBox pizzaBox) {
		this.pizzaBox = pizzaBox;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Boi that's a del");
		
	}
	
}
