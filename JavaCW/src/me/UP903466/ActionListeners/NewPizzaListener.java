package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.NewPizzaWin;
import me.UP903466.gui.PizzaApp;

public class NewPizzaListener implements ActionListener {
	
	private final PizzaApp app;
	
	/**
	 * @param app
	 * The application where the Pizza will be added
	 */
	public NewPizzaListener(PizzaApp app) {
		this.app = app;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// Create a new dialog window for the pizza's creation
		@SuppressWarnings("unused")
		NewPizzaWin win = new NewPizzaWin(this.app, this.app.getOrder(), this.app.getPizzaPanel());
	}
	
}
