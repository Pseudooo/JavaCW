package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.EditPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.objects.Pizza;

public class ConfirmChangesListener implements ActionListener {
	
	private final PizzaApp app;
	private final EditPizzaWin window;
	
	public ConfirmChangesListener(PizzaApp app, EditPizzaWin window) {
		this.app = app;
		this.window = window; // Assign
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// Update the pizza reference
		Pizza p = this.window.getPizza();
		p.setSize(this.window.getSelectedSize());
		p.setCrust(this.window.getSelectedCrust());
		p.setTopping1(this.window.getSelectedTopping1());
		p.setTopping2(this.window.getSelectedTopping2());
		p.setSauce(this.window.getSelectedSauce());
		
		// Update the panel on the window
		this.window.getPizzaBox().updateContent();
		
		// Kill the edit window
		this.window.dispose();
		
		this.app.updateOrderText();
		
	}
	
}
