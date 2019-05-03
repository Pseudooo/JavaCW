package me.UP903466.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import me.UP903466.ActionListeners.ClearOrderListener;
import me.UP903466.ActionListeners.NewPizzaListener;
import me.UP903466.objects.Order;

public class PizzaApp extends JFrame {

	private static final long serialVersionUID = 3463110150438682724L;

	private Order order;
	private PizzaPanel pane;
	
	private JLabel lbl_TotalCost;
	
	public PizzaApp() {
		
		// Order that will be used internally to track pizzas
		this.order = new Order();
		
		// PizzaPanel that will contain all Pizzas currently in the order
		this.pane = new PizzaPanel(this);
		
		// Attempt look and feel
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(Exception e) {
			// Handle error
			System.err.println("An error has occurred with the look at feel!");
			e.printStackTrace();
		}
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		// Setup window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pizzas");
		this.setSize(1050, 920);
		this.setResizable(false);
		
		this.lbl_TotalCost = new JLabel("<html><h2>Order Cost: <em>£0.00</em><br>Quantity: <em>0</em></h2></html>");
		JButton btn_NewPizza = new JButton("New Pizza");
		JButton btn_ClearOrder = new JButton("Clear Order");
		
		btn_NewPizza.addActionListener(new NewPizzaListener(this));
		btn_ClearOrder.addActionListener(new ClearOrderListener(this));
		// Assign layout
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		// Header container
		JPanel header = new JPanel();
		header.setLayout(new GridLayout(0, 2));
		
		JPanel left = new JPanel();
		//left.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel right = new JPanel();
		//right.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		left.add(lbl_TotalCost);
		right.add(btn_NewPizza);
		right.add(btn_ClearOrder);
		
		header.add(left);
		header.add(right);
		// Set borders
		right.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		left.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		header.setBorder(BorderFactory.createLineBorder(Color.black));
		
		Box headerContainer = Box.createHorizontalBox();
		headerContainer.setMaximumSize(new Dimension(1000,100));
		headerContainer.add(header);
		
		this.getContentPane().add(headerContainer);
		
		this.getContentPane().add(this.pane);
		
		this.setVisible(true);
		
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public PizzaPanel getPizzaPanel() {
		return this.pane;
	}
	
	public void updateOrderText() {
		this.lbl_TotalCost.setText(String.format("<html><h2>Order Cost: <em>£%.2f</em><br>Quantity: <em>%d</em></h2></html>",
				this.order.getTotalCost(),
				this.order.size()));
	}
	
}
