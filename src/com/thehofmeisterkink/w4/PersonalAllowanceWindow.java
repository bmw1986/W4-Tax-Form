package com.thehofmeisterkink.w4;

import java.awt.*;  

import javax.swing.*;  
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class PersonalAllowanceWindow {
	
	public static void callWindow() {
	
		JFrame frame = new JFrame("Personal Allowance Worksheet");
		
		JPanel firstRow = new JPanel();
		firstRow.setLayout(new BoxLayout(firstRow, BoxLayout.X_AXIS));
	
	//// w4 Component ////
			
		JLabel w4 = new JLabel("<html>Form W-4 <br> Department of the Treasury  <br> Internal Revenue Service</html>");
		firstRow.add(w4);
	
	//// Title Component ////
		
		JLabel title = new JLabel("<html> <h2>Employee's Withholding Allowance Certificate </h2></html>");
		title.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
		title.setBorder(new EmptyBorder(0, 10, 0, 10));
		firstRow.add(title);
		
	//// OMBNo Component ////
	
		JLabel OMBNumber = new JLabel("<html>OMB No. 1545-0074 <br><big>2013</big><html>");
		firstRow.add(OMBNumber);
		
		frame.setPreferredSize(new Dimension(600,200));
		frame.setLocation(300, 300);
		frame.pack();
		frame.setVisible(true);
	   
	   frame.add(firstRow);
	}
}