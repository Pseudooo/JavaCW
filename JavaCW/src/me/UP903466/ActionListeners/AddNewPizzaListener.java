package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.NewPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaBox;
import me.UP903466.gui.PizzaPanel;
import me.UP903466.objects.Order;
import me.UP903466.objects.Pizza;

public class AddNewPizzaListener implements ActionListener {

	private final PizzaApp app;
	private final NewPizzaWin window;
	private final Order order;
	private final PizzaPanel panel;
	
	public AddNewPizzaListener(PizzaApp app, NewPizzaWin window, Order order, PizzaPanel panel) {
		this.app = app;
		this.window = window;
		this.order = order;
		this.panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Kill the window
		window.dispose();
		
		Pizza p = new Pizza(
					window.getSelectedSize(),
					window.getSelectedCrust(),
					window.getSelectedSauce(),
					window.getSelectedTopping1(),
					window.getSelectedTopping2()
				);
		
		this.order.addPizza(p);
		
		this.panel.addPizzaBox(new PizzaBox(this.app, p));
		
		this.app.updateOrderText();
		
	}
	
}
