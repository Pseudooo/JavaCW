package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.UP903466.gui.NewPizzaWin;
import me.UP903466.gui.PizzaApp;
import me.UP903466.gui.PizzaPanel;
import me.UP903466.objects.Order;

public class NewPizzaListener implements ActionListener {
	
	private final PizzaApp app;
	private final Order order;
	private final PizzaPanel panel;
	
	public NewPizzaListener(PizzaApp app, Order order, PizzaPanel panel) {
		this.app = app;
		this.order = order;
		this.panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		@SuppressWarnings("unused")
		NewPizzaWin win = new NewPizzaWin(this.app, this.order, this.panel);
	}
	
}
