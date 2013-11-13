package com.thehofmeisterkink.w4;

import java.awt.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;  
import java.awt.Dimension;  
import java.awt.FlowLayout;  
  



import java.text.ParseException;

import javax.swing.*;  
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JTextField;
import javax.swing.JButton;

public class W4 {
    
	private static String initials[] = {"",
		"A.","B.", "C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};
	
	private static String states[] = {"",
		"Alabama-AL", "Alaska-AK", "Arizona-AZ", "Arkansas-AR",
		"California-CA","Colorado-CO","Connecticut-CT",
		"Delaware-DE",
		"Florida-FL",
		"Georgia-GA",
		"Hawaii-HI",
		"Idaho-ID","Illinois-IL","Indiana-IN","Iowa-IA",
		"Kansas-KS","Kentucky-KY",
		"Louisiana-LA",
		"Maine-ME","Maryland-MD","Massachusetts-MA","Michigan-MI","Minnesota-MN","Mississippi-MS","Missouri-MO","Montana-MT",
		"Nebraska-NE", "Nevada-NV", "New Hampshire-NH", "New Jersey-NJ", "New Mexico-NM", "New York-NY", "North Carolina-NC", "North Dakota-ND",
		"Ohio-OH", "Oklahoma-OK", "Oregon-OR",
		"Pennsylvania-PA",
		"Rhode Island-RI",
		"South Carolina-SC", "South Dakota-SD",
		"Tennessee-TN",
		"Texas-TX",
		"Utah-UT",
		"Vermont-VT",
		"Virginia-VA",
		"Washington-WA","West Virginia-WV","Wisconsin-WI","Wyoming-WY",
		"American Samoa-AS",
		"District of Columbia-DC",
		"Federated States of Micronesia-FM",
		"Guam-GU",
		"Marshall Islands-MH",
		"Northern Mariana Islands-MP",
		"Palau-PW",
		"Puerto Rico-PR",
		"Virgin Islands-VI"};
	
	static int askAnother = 0;
	
	public static void main(String[] args) {
		
	//////Creates a Frame ////

		final JFrame frame = new JFrame("The W4 Form");
		
	//// titlePanel Panel is made and added ////
		
		JPanel titlePlanel = new JPanel();
		titlePlanel.setLayout(new BoxLayout(titlePlanel, BoxLayout.X_AXIS));

	//// Components are added to titlePanel ////
			
		JLabel w4 = new JLabel("<html> Form W-4 <br> Department of the Treasury  <br> Internal Revenue Service </html>");
		titlePlanel.add(w4);
		
		JLabel title = new JLabel("<html> <h2> Employee's Withholding Allowance Certificate </h2> </html>");
		title.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
		title.setBorder(new EmptyBorder(0, 10, 0, 10));
		titlePlanel.add(title);
	
		JLabel OMBNumber = new JLabel("<html> OMB No. 1545-0074 <br> <big> 2013 </big> </html>");
		titlePlanel.add(OMBNumber);

	//// Body Panel is made //// 
		
       final JPanel body = new JPanel();
       body.setBorder(new LineBorder(Color.black, 2));
       body.setLayout(new GridBagLayout());
       GridBagConstraints c = new GridBagConstraints();
       
//////////////////////////////////////    1st Row (Name)   ////////////////////////////////////////////
	   
       //// Asks for the First and Middle Name ////
        
	        JPanel question1_firstName = new JPanel();
	        question1_firstName.setOpaque(false);
	    
	        JLabel labelFirstName = new JLabel("<html> <b> 1. </b> Your first and middle initial </html>");
	        question1_firstName.add(labelFirstName);
	        
	        question1_firstName.add(new JTextField(15));
	        question1_firstName.add(new JComboBox(initials));
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 0;
	        c.weightx = 0.5;
	        c.gridwidth = 2;
	        body.add(question1_firstName, c);
	        
       //// Asks for the Last Name ////
	        
	        JPanel question1_lastName = new JPanel();
	        question1_lastName.setOpaque(false);
	        
	        JLabel labelLastName = new JLabel("<html> Last name </html>");
	        question1_firstName.setAlignmentX(0);
	        question1_lastName.add(labelLastName);
	        
	        question1_lastName.add(new JTextField(15));
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 2;
	        c.gridy = 0;
	        c.gridwidth = 2;
	        body.add(question1_lastName, c);
	        
	   //// Creates a line Separator ////
	        
	        JSeparator line0_2 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 1;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line0_2, c);
	        
//////////////////////////////////////     2nd Row (SSN)   //////////////////////////////////////////// 
	        
	        // Formated SSN Code //
	        
		        MaskFormatter formattedSSN = null;
				try {
					formattedSSN = new MaskFormatter("###-###-####");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			JPanel question2 = new JPanel();
	        question2.setLayout(new BoxLayout(question2,BoxLayout.Y_AXIS));
	        question2.setOpaque(false);
	        
	        JLabel labelSSN = new JLabel("<html> <b> 2. </b>  Your social security number </html>");
	        labelSSN.setAlignmentX(0);
	        question2.add(labelSSN);
	        
	        JFormattedTextField textSSN = new JFormattedTextField(formattedSSN);
	        textSSN.setAlignmentX(0);
	        question2.add(textSSN);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 2;
	        c.weighty = 2;
	        c.gridwidth = 2;
	        body.add(question2, c);
	        
	   //// Creates a line Separator ////
	        
	        JSeparator line2_4 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 3;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line2_4, c);
        
        
//////////////////////////////////////    3nd Row (Home Address)   ////////////////////////////////////////////
        
	   //// Prompts for an Street Address ////
	        
		    JPanel question3_streetAddress = new JPanel();
		    question3_streetAddress.setLayout(new BoxLayout(question3_streetAddress,BoxLayout.Y_AXIS));
		    question3_streetAddress.setOpaque(false);
		    
		    JLabel labelAddress = new JLabel("<html> <b> 3. </b> Home address (number and street or rural route </html>)");
		    labelAddress.setAlignmentX(0);
	        question3_streetAddress.add(labelAddress);

	        JTextField textAddress = new JTextField(15);
	        textAddress.setAlignmentX(0);
	        question3_streetAddress.add(textAddress);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 1;
	        c.gridy = 5;
	        c.weighty = 2;
	        c.gridwidth = 2;
	        body.add(question3_streetAddress, c);
	        
	        
	   //// Prompts for a City ////
	        
		    JPanel question3_city = new JPanel();
		    question3_city.setLayout(new BoxLayout(question3_city,BoxLayout.Y_AXIS));
	        
		    JLabel labelCity = new JLabel("<html> City <html>");
		    labelCity.setAlignmentX(0);
		    question3_city.add(labelCity);

	        JTextField textCity = new JTextField(15);
	        textCity.setAlignmentX(0);
	        question3_city.add(textCity);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 2;
	        c.gridy = 5;
	        c.weighty = 2;
	        c.gridwidth = 2;
	        body.add(question3_city, c);
	        
	        
	   //// Prompts for a State ////
	        
		    JPanel question3_state = new JPanel();
		    question3_state.setLayout(new BoxLayout(question3_state,BoxLayout.Y_AXIS));
		    question3_state.setOpaque(false);
	        
		    JLabel labelState = new JLabel("<html> State </html>");
		    labelState.setAlignmentX(0);
		    question3_state.add(labelState);

		    JComboBox cStates = new JComboBox(states);
		    cStates.setAlignmentX(0);
		    question3_state.add(cStates);		    
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 3;
	        c.gridy = 5;
	        c.weighty = 2;
	        c.gridwidth = 2;
	        body.add(question3_state, c);
	        
	   //// Prompts for a Zip Code ////
	        
	        // Formated Zip Code //
	        
		        MaskFormatter formattedZipCode = null;
				try {
					formattedZipCode = new MaskFormatter("#####");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	              
	        
		    JPanel question3_zip = new JPanel();
		    question3_zip.setLayout(new BoxLayout(question3_zip,BoxLayout.Y_AXIS));
	        
		    JLabel labelZip = new JLabel("<html> State </html>");
		    labelZip.setAlignmentX(0);
		    question3_zip.add(labelZip);

		    JFormattedTextField textZip = new JFormattedTextField(formattedZipCode);
	        textZip.setAlignmentX(0);
	        question3_zip.add(textZip);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 4;
	        c.gridy = 5;
	        c.weighty = 2;
	        c.gridwidth = 2;
	        body.add(question3_zip, c);
	        
	   //// Creates a line Separator ////
	        
	        JSeparator line5_7 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 6;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line5_7, c);
	        
//////////////////////////////////////////  4rd Row  (Maritial Status)  ////////////////////////////////////////////
	        
	   //// Asks for Maritial Status ////
	        
	        JPanel question4 = new JPanel();
	        question4.setLayout(new BoxLayout(question4,BoxLayout.Y_AXIS));
	        question3_state.setOpaque(false);
	        
	        JPanel question4_buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        
	        JRadioButton single = new JRadioButton("Single");
	        JRadioButton married = new JRadioButton("Married");
	        JRadioButton married2 = new JRadioButton("Married, but withhold at higher Single rate.");
	        
	        question4_buttons.add(new JLabel("<html> <b> 4 </b> </html>"));
	        question4_buttons.add(single);
	        question4_buttons.add(married);
	        question4_buttons.add(married2);
	        
	        ButtonGroup exclusive = new ButtonGroup();
	        exclusive.add(single);
	        exclusive.add(married);
	        exclusive.add(married2);
	        
	        JLabel question4_note = new JLabel("<html><b>Note.</b> <tt><small>If married, but legally separated, or spouse is a nonresident alient, check the \"Single\" box.</small></tt>");
	        question4_buttons.setAlignmentX(0);
	        question4_note.setAlignmentX(0);
	        question4.add(question4_buttons);
	        question4.add(question4_note);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 8;
	        c.gridwidth = 4;
	        c.weightx = 0.5;
	        c.weighty = 2;
	        body.add(question4, c);
	        
	   //// Creates a line Separator ////
	        
	        JSeparator line8_10 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 9;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line8_10, c);
	        
///////////////////////////////////////    5th Row (Name differ from SSN Card)    /////////////////////////////////////////
        
	       JPanel question5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	       question5.setOpaque(false);
	        
	       JLabel labelDiffer = new JLabel("<html> <b> 5. </b> Does your name differ from the one that is on your Social Security Card </html>");
	       labelDiffer.setAlignmentX(0);
	       question5.add(labelDiffer);
   
	       JPanel question5_buttons = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
	       JRadioButton buttonsDifferYes= new JRadioButton("Yes");
	       JRadioButton buttonsDifferNo = new JRadioButton("No");
	       question5_buttons.add(buttonsDifferYes);
	       question5_buttons.add(buttonsDifferNo);
	       
	       ButtonGroup question5_buttonGroup = new ButtonGroup();
	       question5_buttonGroup.add(buttonsDifferYes);
	       question5_buttonGroup.add(buttonsDifferNo);
	       
	       question5.add(labelDiffer);
	       question5.add(question5_buttons);
	       
	       c = new GridBagConstraints();
	       c.anchor = GridBagConstraints.LINE_START;
	       c.fill = GridBagConstraints.HORIZONTAL;
	       c.gridx = 0;
	       c.gridy = 10;
	       c.gridwidth = 4;
	       c.weightx = 0.5;
	       c.weighty = 2;
	       body.add(question5, c);
	       
		   //// Creates a line Separator ////
	        
	        JSeparator line10_12 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 11;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line10_12, c);
	
////////////////////////////////////////     6th Row (Allowances)    ////////////////////////////////////////////

	        JPanel question6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        question6.setOpaque(false);
	        
	        JLabel allowancesLabel_1 = new JLabel("<html> <b> 6. </b> What are the total number of allowances you are claiming? </html>");
	        JTextField allowancesText = new JTextField(" Enter Amount Here ");
	        JButton question6_button = new JButton("Click for help");
	        
	        question6.add(allowancesLabel_1);
	        question6.add(allowancesText);
	        question6.add(question6_button);
	        
	        question6_button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					PersonalAllowanceWindow.callWindow();
				}
	        });
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 12;
	        c.gridwidth = 6;
	        c.weightx = 0.5;
	        body.add(question6, c);
	        
	   //// Creates a line Separator ////
	        
	        JSeparator line12_14 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 13;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line12_14, c);
	        
////////////////////////////////////////   7th Row (Additional)    ////////////////////////////////////////////

			JPanel question7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			question7.setOpaque(false);
			
			JLabel question7_label = new JLabel("<html> <b> 7. </b> Would you like to add an aditional amount to be withheld from each paycheck? </html>");
			question7.add(question7_label);

			JTextField question7_text = new JTextField(" Enter amount here ");
			question7.add(question7_text);
			
			JButton question7_button = new JButton("Click here for help");
			question7.add(question7_button);
			
			question7_button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					WithholdingWindow.callWindow();
				}
	        });
			
			c = new GridBagConstraints();
			c.anchor = GridBagConstraints.LINE_START;
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 14;
			c.gridwidth = 6;
			c.weightx = 0.5;
			body.add(question7, c);
			
	   //// Creates a line Separator ////
	        
	        JSeparator line14_16 = new JSeparator();
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 15;
	        c.weightx = 0.5;
	        c.gridwidth = 6;
	        body.add(line14_16, c);
	       
////////////////////////////////////////    8th Row (Accepting Terms)    ////////////////////////////////////////////
        
       //// Accepting Terms ////
	        
		    JPanel exempt = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JLabel exemptNote = new JLabel("<html><b>8. </b>I claim exemption from withholding for 2013, and I certify that I meet <b>both</b> of the following conditions for exemption. <ul>  <li>Last year I had a right to a refund of <b>all</b> federal income tax withheld because I had <b>no</b> tax liability, <b>and</b></li>  <li>This year I expect a refund of <b>all</b> federal income tax withheld because I expect to have <b>no</b> tax liability.</li></ul> <br> If you meet both conditions, check the \"Exempt\" box on right.</html>");
	        JCheckBox exemptBox = new JCheckBox("Exempt");
	        exempt.add(exemptNote);
	        exempt.add(exemptBox);
			
	        c = new GridBagConstraints();
	        c.anchor = GridBagConstraints.LINE_START;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        c.gridx = 0;
	        c.gridy = 16;
	        c.gridwidth = 6;
	        c.weightx = 0.5;
	        body.add(exempt, c);
	        
	        JPanel bottom = new JPanel();
			bottom.setLayout(new BoxLayout(bottom, BoxLayout.Y_AXIS));
			JLabel decl = new JLabel("Under penalties of perjury, I declare that I have examined this certificate and, to the best of my knowledge and belief, it is true, correct, and complete.");
			decl.setAlignmentX(0);
			bottom.add(decl);
		
		
//////////////////////////////////////     9th Row (Signature)    ////////////////////////////////////////////  			
			
		//// The Employee's Signature	
			
			JPanel signAndDate = new JPanel();
			signAndDate.setLayout(new BoxLayout(signAndDate, BoxLayout.X_AXIS));
			signAndDate.setAlignmentX(0);
	        signAndDate.setPreferredSize(new Dimension(500, 35));
			signAndDate.add(new JButton("Employee's signature"));
			signAndDate.add(new JLabel("<html>SIGNATURE HERE (This form is not valid unless you sign it.) </html>"));
	        
		//// Enter the Date ////
			
			final JButton b = new JButton("Date");
			final JLabel text = new JLabel("Enter a date   ");
			
			signAndDate.add(b);
			signAndDate.add(text);
			
			b.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
			        text.setText(new DatePicker(frame).setPickedDate());
	            }
	        });
			bottom.add(signAndDate);
			
//////////////////////    Adds the Content     ///////////////////////////////			
        
		frame.add(titlePlanel, BorderLayout.NORTH);
		frame.add(body, BorderLayout.CENTER);
		frame.add(bottom, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(true);
		frame.setLocation(50, 50);
		frame.setVisible(true);
        
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Other Stuff
	
//	
//private static JPanel buildPanel() {
//	GridBagConstraints gbc = new GridBagConstraints();  
//    gbc.insets = new Insets(2, 1, 2, 1);  
//    gbc.weightx = 1.0;  
//    gbc.weighty = 1.0;  
//
//    JPanel p1 = new JPanel(new GridBagLayout());  
//    gbc.gridwidth = gbc.RELATIVE;  
//    p1.add(new JButton("button 1"), gbc);  
//    gbc.gridwidth = gbc.REMAINDER;  
//    p1.add(new JButton("button 2"), gbc);  
//    gbc.gridwidth = gbc.RELATIVE;  
//    p1.add(new JButton("button 3"), gbc);  
//    gbc.gridwidth = gbc.REMAINDER;  
//    p1.add(new JButton("button 4"), gbc);  
//
//    return p1;  
//}


//////Creates a Frame ////
//	
//			final JFrame frame = new JFrame("The W4 Form");
//			JPanel titlePanel = (JPanel)frame.getContentPane();
//			
//		//// First Row Component is made and added ////
//			
//			JPanel firstRow = new JPanel();
//			firstRow.setLayout(new BoxLayout(firstRow, BoxLayout.X_AXIS));
//
//		//// w4 Component ////
//				
//			JLabel w4 = new JLabel("<html>Form W-4 <br> Department of the Treasury  <br> Internal Revenue Service</html>");
//			firstRow.add(w4);
//		
//			//// Title Component ////
//			
//			JLabel title = new JLabel("<html> <h2>Employee's Withholding Allowance Certificate </h2></html>");
//			title.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
//			title.setBorder(new EmptyBorder(0, 10, 0, 10));
//			firstRow.add(title);
//			
//		//// OMBNo Component ////
//		
//			JLabel OMBNumber = new JLabel("<html>OMB No. 1545-0074 <br><big>2013</big><html>");
//			firstRow.add(OMBNumber);
//
//		//// Body Component //// 
//			
//	        final JPanel body = new JPanel();
//	        body.setBorder(new LineBorder(Color.black, 2));
//	        body.setLayout(new GridBagLayout());
//	        GridBagConstraints c;
//	        
////////////////////////////////////////  Example Row 1    ////////////////////////////////////////////
//       
//
////	        theBigQuestion.setOpaque(false);
////	        theBigQuestion.setLayout(new BoxLayout(theBigQuestion, BoxLayout.Y_AXIS));    
////	     
////	        if ( askAnother == 1) {
////	        	JPanel moreQuestions = new JPanel();
////				moreQuestions.setOpaque(false);
////				moreQuestions.setLayout(new BoxLayout(moreQuestions, BoxLayout.Y_AXIS));
////				
////				JLabel theNewQuestion = new JLabel("<html> Hahaha, I don't believe you!</html>");
////		        moreQuestions.add(theNewQuestion);	
////		        
////		        c = new GridBagConstraints();
////		        c.anchor = GridBagConstraints.LINE_START;
////		        c.gridx = 0;
////		        c.gridy = 1;
////		        c.weightx = 0.5;
////		        c.gridwidth = 2;
////	        	body.add(moreQuestions, c);
////	        }
//	        
//	        final JPanel theMarriageQuestion = new JPanel();
//	        theMarriageQuestion.setOpaque(false);
//	        theMarriageQuestion.setLayout(new BoxLayout(theMarriageQuestion, BoxLayout.Y_AXIS));
//	        
//	        JLabel theBigQuestion = new JLabel("<html> Are you married? <html>");
//	        theMarriageQuestion.add(theBigQuestion);
//	        
//	        JCheckBox checkBox = new JCheckBox("Yes");
//	        theMarriageQuestion.add(checkBox);
//	        
//	        checkBox.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					
//					JLabel marriageQuestion_1 = new JLabel("<html> Do you have only one job and your spouse does not work? </html>");
//					JCheckBox marriageCheckBox_1 = new JCheckBox();
//					
//					JLabel marriageQuestion_2 = new JLabel("<html> This is anohter question that could be asked? </html>");
//					JCheckBox marriageCheckBox_2 = new JCheckBox();
//					
//					theMarriageQuestion.add(marriageQuestion_1);
//					theMarriageQuestion.add(marriageCheckBox_1);
//					
//					theMarriageQuestion.add(marriageQuestion_2);
//					theMarriageQuestion.add(marriageCheckBox_2);
//					
//					theMarriageQuestion.revalidate();
//					body.revalidate();
//				}
//			});
//	 
//	        c = new GridBagConstraints();
//	        c.anchor = GridBagConstraints.LINE_START;
//	        c.gridx = 0;
//	        c.gridy = 0;
//	        c.weightx = 0.5;
//	        c.gridwidth = 2;	        
//	        body.add(theMarriageQuestion, c);
//	        
//	        titlePanel.add(firstRow, BorderLayout.NORTH);
//			titlePanel.add(body, BorderLayout.CENTER);
//			
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			
//			frame.pack();
//			frame.setResizable(true);
//			frame.setLocation(5, 5);
//			frame.setVisible(true);
//	        
//		}
//}

	        
//	        JSeparator line = new JSeparator();
//	        c = new GridBagConstraints();
//	        c.anchor = GridBagConstraints.LINE_START;
//	        c.fill = GridBagConstraints.HORIZONTAL;
//	        c.gridx = 0;
//	        c.gridy = 1;
//	        c.gridwidth = 6;
//	        c.weightx = 0.5;
//	        body.add(line, c);
	        
//////////////////////////////////////  Example Row 2    ////////////////////////////////////////////
	        
           
//			JPanel theBigQuestion2 = new JPanel();
//			theBigQuestion2.setOpaque(false);
//			theBigQuestion2.setLayout(new BoxLayout(theBigQuestion2, BoxLayout.Y_AXIS));
//			
//			JLabel theQuestion2 = new JLabel("<html> Will you marry me?</html>");
//			theBigQuestion2.add(theQuestion2);
//			
//			JCheckBox checkBox2 = new JCheckBox("Yes");
//			theBigQuestion2.add(checkBox2);
//			checkBox2.addActionListener(new ActionListener() {
//			
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//				
//					final JFrame newWindow = new JFrame();
//					JLabel description = new JLabel("Here is some text explaining in more detail what just happened");
//					
//					newWindow.setPreferredSize(new Dimension(600,200));
//					newWindow.setLocation(300, 300);
//					
//					newWindow.add(description); 
//					newWindow.pack();
//					newWindow.setVisible(true);
//				}
//			});
//			
//			
//			JButton info2 = new JButton("i");
//			theBigQuestion2.add(info2);
//			info2.addActionListener(new ActionListener() {
//			
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//				
//					final JFrame newWindow2 = new JFrame();
//					JLabel description = new JLabel("Here is some text explaining in more detail what just happened");
//					
//					newWindow2.setPreferredSize(new Dimension(600,200));
//					newWindow2.setLocation(300, 300);
//					
//					newWindow2.add(description); 
//					newWindow2.pack();
//					newWindow2.setVisible(true);
//				}
//			});
//			
//			
//			c = new GridBagConstraints();
//			c.anchor = GridBagConstraints.LINE_START;
//			c.gridx = 0;
//			c.gridy = 2;
//			c.weightx = 0.5;
//			c.gridwidth = 2;
//			body.add(theBigQuestion, c);
//			
//	        JSeparator line2 = new JSeparator();
//	        c = new GridBagConstraints();
//	        c.anchor = GridBagConstraints.LINE_START;
//	        c.fill = GridBagConstraints.HORIZONTAL;
//	        c.gridx = 0;
//	        c.gridy = 3;
//	        c.gridwidth = 6;
//	        c.weightx = 0.5;
//	        body.add(line2, c);
	        
			
//////////////////////////////////////            ////////////////////////////////////////////   
	
	
