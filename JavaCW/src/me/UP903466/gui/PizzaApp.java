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

import me.UP903466.ActionListeners.NewPizzaListener;
import me.UP903466.objects.Order;

public class PizzaApp extends JFrame {

	private static final long serialVersionUID = 3463110150438682724L;

	private Order order;
	private PizzaPanel pane;
	
	public PizzaApp() {
		
		// Order that will be used internally to track pizzas
		this.order = new Order();
		
		this.pane = new PizzaPanel(this);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(Exception e) {
			System.err.println("An error has occurred with the look at feel!");
			e.printStackTrace();
		}
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		// Setup window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pizzas");
		this.setSize(1050, 920);
		this.setResizable(false);
		
		JLabel lbl_TotalCost = new JLabel("<html><h2>Order Cost: <em>£0.00</em></h2></html>");
		JButton btn_NewPizza = new JButton("New Pizza");
		JButton btn_ClearOrder = new JButton("Clear Order");
		
		btn_NewPizza.addActionListener(new NewPizzaListener(this, this.order, this.pane));
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
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
	
}
