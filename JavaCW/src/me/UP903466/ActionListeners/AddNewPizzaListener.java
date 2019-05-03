package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.NewPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;
import me.UP903466.objects.Pizza;

public class AddNewPizzaListener implements ActionListener {

	private final PizzaApp app;
	private final NewPizzaWin window;
	
	/**
	 * 
	 * @param app
	 * The application that this listener is to be instantiated by
	 * @param window
	 * The dialog window that is being interacted with
	 */
	public AddNewPizzaListener(PizzaApp app, NewPizzaWin window) {
		this.app = app;
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Kill the window
		window.dispose();
		
		// Instantiate the pizza that is to be added
		Pizza p = new Pizza(
					window.getSelectedSize(),
					window.getSelectedCrust(),
					window.getSelectedSauce(),
					window.getSelectedTopping1(),
					window.getSelectedTopping2()
				);
		
		// Register the pizza with both the order and the iterface
		this.app.getOrder().addPizza(p);
		this.app.getPizzaPanel().addPizzaBox(new PizzaBox(this.app, p));
		
		// Update the total cost in the primary window
		this.app.updateOrderText();
		
	}
	
}
