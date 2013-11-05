package com.thehofmeisterkink.w4;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Info_PersonalAllowances extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		
		JLabel blah = new JLabel("yo");
		
		Graphics2D g2 = (Graphics2D)g;
		g2.drawString("Bah bah black sheep", 40, 0);

	}
}




//
//final Info_PersonalAllowances thing = new Info_PersonalAllowances();
//
//thing.setPreferredSize(new Dimension(200,200));
//thing.setLocation(200, 200);
//frame.getContentPane().add(thing);
//
//frame.pack();
//frame.setVisible(true);