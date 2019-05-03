package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.PizzaApp;

public class ClearOrderListener implements ActionListener {

	private final PizzaApp app;
	
	public ClearOrderListener(PizzaApp app) {
		this.app = app;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// Empty the current order
		this.app.getPizzaPanel().clear();
		this.app.getOrder().clear();
		this.app.updateOrderText();
		
	}
	
}
