package me.UP903466.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import me.UP903466.ActionListeners.DeletePizzaListener;
import me.UP903466.ActionListeners.EditPizzaListener;
import me.UP903466.objects.Pizza;

public class PizzaBox extends JComponent {

	private static final long serialVersionUID = 1L;
	
	private final Pizza pizza;
	
	private final JLabel lbl_TotalCost, lbl_Size, lbl_Crust, lbl_BaseCost,
		lbl_Topping1, lbl_Topping2, lbl_Sauce;
	private final JButton btn_Edit, btn_Del;
	
	public PizzaBox(PizzaApp app, Pizza pizza) {
		
		// Setup class
		this.pizza = pizza;
		this.setLayout(new GridLayout(8,0));
		
		// Init all member vars
		this.lbl_TotalCost = new JLabel();
		this.lbl_Size = new JLabel();
		this.lbl_Crust = new JLabel();
		this.lbl_BaseCost = new JLabel();
		this.lbl_Topping1 = new JLabel();
		this.lbl_Topping2 = new JLabel();
		this.lbl_Sauce = new JLabel();
		
		// Update all labels to contain their respective values
		this.updateContent();
		
		// Add components to container
		this.add(this.lbl_TotalCost);
		this.add(this.lbl_Size);
		this.add(this.lbl_Crust);
		this.add(this.lbl_BaseCost);
		this.add(this.lbl_Topping1);
		this.add(this.lbl_Topping2);
		this.add(this.lbl_Sauce);
		
		// Setup buttons
		JPanel BtnContainer = new JPanel();
		BtnContainer.setLayout(new GridLayout(0, 2));
		this.btn_Edit = new JButton("Edit");
		this.btn_Del = new JButton("Delete");
		BtnContainer.add(this.btn_Edit);
		BtnContainer.add(this.btn_Del);
		
		// Buttons to edit and delete this respective pizza
		this.add(BtnContainer);
		
		// Assign border for this item
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		this.btn_Edit.addActionListener(new EditPizzaListener(this));
		this.btn_Del.addActionListener(new DeletePizzaListener(app, this));
		
	}
	
	public void updateContent() {
		
		// Update the text of all of the labels
		
		this.lbl_TotalCost.setText(
				String.format("TOTAL COST: £%.2f", this.pizza.getTotalCost()));
		
		this.lbl_Size.setText(
				String.format("%s Size: £%.2f", this.pizza.getSize(), 
						this.pizza.getSize().getCost()));
		
		this.lbl_Crust.setText(
				String.format("%s Crust: £%.2f", this.pizza.getCrust(),
						this.pizza.getCrust().getCost()));
		
		this.lbl_BaseCost.setText(
				String.format("BASE COST: £%.2f", this.pizza.getBaseCost()));
		
		this.lbl_Topping1.setText(
				String.format("%s Topping: 5 * £%.2f = £%.2f", this.pizza.getTopping1(),
						this.pizza.getTopping1().getCost(), 
						this.pizza.getTopping1().getCost() * 5));
		
		this.lbl_Topping2.setText(
				String.format("%s Topping: 4 * £%.2f = £%.2f", this.pizza.getTopping2(),
						this.pizza.getTopping2().getCost(),
						this.pizza.getTopping2().getCost() * 4));
		
		this.lbl_Sauce.setText(
				String.format("%s Sauce: £%.2f", this.pizza.getSauce(),
						this.pizza.getSauce().getCost()));
		
	}
	
	public Pizza getPizza() {
		return this.pizza;
	}
	
}
