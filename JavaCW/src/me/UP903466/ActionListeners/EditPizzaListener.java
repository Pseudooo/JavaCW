package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import me.UP903466.gui.EditPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;

public class EditPizzaListener implements ActionListener {
	
	private final PizzaApp app;
	private final PizzaBox pizzaBox;
	
	public EditPizzaListener(PizzaApp app, PizzaBox pizzaBox) {
		this.app = app;
		this.pizzaBox = pizzaBox;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		@SuppressWarnings("unused")
		EditPizzaWin edit = new EditPizzaWin(this.app, this.pizzaBox);
		
	}
}
