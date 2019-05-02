package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import me.UP903466.gui.EditPizzaWin;
import me.UP903466.gui.PizzaBox;

public class EditPizzaListener implements ActionListener {
	
	private final PizzaBox pizzaBox;
	
	public EditPizzaListener(PizzaBox pizzaBox) {
		this.pizzaBox = pizzaBox;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		@SuppressWarnings("unused")
		EditPizzaWin edit = new EditPizzaWin(this.pizzaBox);
		
	}
}
