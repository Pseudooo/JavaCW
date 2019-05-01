package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import me.UP903466.gui.PizzaBox;

public class ConfirmChangesListener implements ActionListener {
	
	private final JFrame window;
	private final PizzaBox pizzaBox;
	
	public ConfirmChangesListener(JFrame window, PizzaBox pizzaBox) {
		this.window = window;
		this.pizzaBox = pizzaBox;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
