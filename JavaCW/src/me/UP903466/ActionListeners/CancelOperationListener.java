package me.UP903466.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelOperationListener implements ActionListener {
	
	private final JFrame window;
	
	/**
	 * @param window
	 * The dialog window that is to be terminated
	 */
	public CancelOperationListener(JFrame window) {
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Close the window
		this.window.dispose();
		
	}
	
}
