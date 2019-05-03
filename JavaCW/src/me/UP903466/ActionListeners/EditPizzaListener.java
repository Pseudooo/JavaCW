package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import me.UP903466.gui.EditPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;

public class EditPizzaListener implements ActionListener {
	
	private final PizzaApp app;
	private final PizzaBox pizzaBox;
	
	/**
	 * @param app
	 * The application where the pizza is located
	 * @param pizzaBox
	 * The PizzaBox that contains the pizza
	 */
	public EditPizzaListener(PizzaApp app, PizzaBox pizzaBox) {
		this.app = app;
		this.pizzaBox = pizzaBox;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// Create a window to edit the pizza from
		@SuppressWarnings("unused")
		EditPizzaWin edit = new EditPizzaWin(this.app, this.pizzaBox);
		
	}
}
