package com.squeaker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchWindow implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New!");
	
	public LaunchWindow() {
		
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Squeaker");
		
		URL iconURL = getClass().getResource("/res/squeakerIcon.png");
		ImageIcon icon = new ImageIcon(iconURL);
		frame.setIconImage(icon.getImage());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) {
			
		}
		
	}
	
}
