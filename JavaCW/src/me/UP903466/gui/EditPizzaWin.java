package me.UP903466.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import me.UP903466.ActionListeners.CancelOperationListener;
import me.UP903466.ActionListeners.ConfirmChangesListener;
import me.UP903466.objects.Crust;
import me.UP903466.objects.Pizza;
import me.UP903466.objects.Sauce;
import me.UP903466.objects.Size;
import me.UP903466.objects.Topping;

public class EditPizzaWin extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JComboBox<Size> cb_Size;
	private JComboBox<Crust> cb_Crust;
	private JComboBox<Topping> cb_Topping1, cb_Topping2;
	private JComboBox<Sauce> cb_Sauce;
	
	private JButton btn_Confirm, btn_Cancel;

	private PizzaBox pizzaBox;
	
	public EditPizzaWin(PizzaBox pizzaBox) {
		
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
		
		this.pizzaBox = pizzaBox;
		
		// Assign combo box options
		this.cb_Size = new JComboBox<Size>(Size.values());
		this.cb_Crust = new JComboBox<Crust>(Crust.values());
		this.cb_Topping1 = new JComboBox<Topping>(Topping.values());
		this.cb_Topping2 = new JComboBox<Topping>(Topping.values());
		this.cb_Sauce = new JComboBox<Sauce>(Sauce.values());
		
		// Assign default values
		this.cb_Size.setSelectedItem(this.pizzaBox.getPizza().getSize());
		this.cb_Crust.setSelectedItem(this.pizzaBox.getPizza().getCrust());
		this.cb_Topping1.setSelectedItem(this.pizzaBox.getPizza().getTopping1());
		this.cb_Topping2.setSelectedItem(this.pizzaBox.getPizza().getTopping2());
		this.cb_Sauce.setSelectedItem(this.pizzaBox.getPizza().getSauce());
		
		JPanel sizePanel = new JPanel();
		sizePanel.setLayout(new FlowLayout());
		JLabel lbl_Size = new JLabel("Size: ");
		sizePanel.add(lbl_Size);
		sizePanel.add(cb_Size);
		this.add(sizePanel);
		
		JPanel crustPanel = new JPanel();
		crustPanel.setLayout(new FlowLayout());
		JLabel lbl_Crust = new JLabel("Crust: ");
		crustPanel.add(lbl_Crust);
		crustPanel.add(this.cb_Crust);
		this.add(crustPanel);
		
		JPanel topping1Panel = new JPanel();
		topping1Panel.setLayout(new FlowLayout());
		JLabel lbl_topping1 = new JLabel("Topping 1: ");
		topping1Panel.add(lbl_topping1);
		topping1Panel.add(this.cb_Topping1);
		this.add(topping1Panel);
		
		JPanel topping2Panel = new JPanel();
		topping2Panel.setLayout(new FlowLayout());
		JLabel lbl_topping2 = new JLabel("Topping 2: ");
		topping2Panel.add(lbl_topping2);
		topping2Panel.add(this.cb_Topping2);
		this.add(topping2Panel);
		
		JPanel saucePanel = new JPanel();
		saucePanel.setLayout(new FlowLayout());
		JLabel lbl_Sauce = new JLabel("Sauce: ");
		saucePanel.add(lbl_Sauce);
		saucePanel.add(this.cb_Sauce);
		this.add(saucePanel);
		
		this.btn_Confirm = new JButton("Confirm");
		this.btn_Cancel = new JButton("Cancel");
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(0, 2));
		btnPanel.add(this.btn_Confirm);
		btnPanel.add(this.btn_Cancel);
		this.add(btnPanel);
		
		ConfirmChangesListener ConfirmListener =
				new ConfirmChangesListener(this);
		this.btn_Confirm.addActionListener(ConfirmListener);
		
		this.btn_Cancel.addActionListener(new CancelOperationListener(this));
		
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
	
	public PizzaBox getPizzaBox() {
		return this.pizzaBox;
	}
	
	public Pizza getPizza() {
		return this.pizzaBox.getPizza();
	}
	
}
