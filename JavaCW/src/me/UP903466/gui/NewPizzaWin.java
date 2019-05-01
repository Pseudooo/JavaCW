package me.UP903466.gui;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.UIManager;

import me.UP903466.objects.Crust;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class NewPizzaWin extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JComboBox<Size> cb_Size;
	private JComboBox<Crust> cb_Crust;
	private JComboBox<Topping> cb_Topping1, cb_Topping2;
	private JComboBox<Sauce> cb_Sauce;
	
	public NewPizzaWin() {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(Exception e) {
			System.err.println("An error has occurred with the look at feel!");
			e.printStackTrace();
		}
		
		// Setup window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pizzas");
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new GridLayout(6, 0));
		
		// Initialize combo boxes
		this.cb_Size = new JComboBox<Size>(Size.values());
		this.cb_Crust = new JComboBox<Crust>(Crust.values());
		this.cb_Topping1 = new JComboBox<Topping>(Topping.values());
		this.cb_Topping2 = new JComboBox<Topping>(Topping.values());
		this.cb_Sauce = new JComboBox<Sauce>(Sauce.values());
		
		// Add compo boxes to content pane
		this.add(this.cb_Size);
		this.add(this.cb_Crust);
		this.add(this.cb_Topping1);
		this.add(this.cb_Topping2);
		this.add(this.cb_Sauce);
		
	}
	
	public Size getSelectedSize() {
		return (Size) this.cb_Size.getSelectedItem();
	}
	
	public Crust getSelectedCrust() {
		return (Crust) this.cb_Crust.getSelectedItem();
	}
	
	public Topping getSelectedTopping1() {
		return (Topping) this.cb_Topping1.getSelectedItem();
	}
	
	public Topping getSelectedTopping2() {
		return (Topping) this.cb_Topping2.getSelectedItem();
	}
	
	public Sauce getSelectedSauce() {
		return (Sauce) this.cb_Sauce.getSelectedItem();
	}
	
}
