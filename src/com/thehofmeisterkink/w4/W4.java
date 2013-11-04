package com.thehofmeisterkink.w4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new JFrame("Form W4");
		
		JPanel contentPane = (JPanel)frame.getContentPane();
		
        //		frame.getContentPane().setBackground(Color.blue);
		
		JPanel firstRow = new JPanel();
		firstRow.setLayout(new BoxLayout(firstRow, BoxLayout.X_AXIS));
		JLabel w4=new JLabel("<html>Form W-4 <br> Department of the Treasury  <br> Internal Revenue Service</html>");
		JLabel title = new JLabel("<html> <h2>Employee's Withholding Allowance Certificate </h2></html>");
		title.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
		title.setBorder(new EmptyBorder(0, 10, 0, 10));
		JLabel OMBNo = new JLabel("<html>OMB No. 1545-0074 <br><big>2013</big><html>");
		firstRow.add(w4);
		firstRow.add(title);
		firstRow.add(OMBNo);
		
        JPanel body = new JPanel();
        body.setBorder(new LineBorder(Color.black, 2));
        body.setLayout(new GridBagLayout());
        GridBagConstraints c;
        
        // first row of body
        JPanel firstAndMiddle = new JPanel();
        //        firstAndMiddle.setBorder(new LineBorder(Color.black, 1));
        firstAndMiddle.setLayout(new BoxLayout(firstAndMiddle,BoxLayout.Y_AXIS));
        JLabel prompt = new JLabel("<html><b>1 </b>Your first and middle initial</html>");
        firstAndMiddle.add(prompt);
        JPanel names = new JPanel();
        names.add(new JTextField(15));
        names.add(new JComboBox(initials));
        prompt.setAlignmentX(0);
        names.setAlignmentX(0);
        firstAndMiddle.add(names);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        c.gridwidth = 2;
        body.add(firstAndMiddle, c);
        
        JPanel lastName = new JPanel();
        lastName.setLayout(new BoxLayout(lastName,BoxLayout.Y_AXIS));
        JLabel lLastName = new JLabel("Last name");
        JTextField tLastName = new JTextField(15);
        lLastName.setAlignmentX(0);
        tLastName.setAlignmentX(0);
        lastName.add(lLastName);
        lastName.add(tLastName);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 2;
        c.weightx = 0.5;
        body.add(lastName, c);
        
        JPanel SSN = new JPanel();
        SSN.setLayout(new BoxLayout(SSN,BoxLayout.Y_AXIS));
        JLabel lSSN = new JLabel("<html><b>2  Your social security number</b></html>");
        JTextField tSSN = new JTextField(15);
        lSSN.setAlignmentX(0);
        tSSN.setAlignmentX(0);
        SSN.add(lSSN);
        SSN.add(tSSN);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 2;
        c.weightx = 0.5;
        body.add(SSN, c);
        
        JSeparator line = new JSeparator();
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(line, c);
        
        // second row of body
        JPanel homeAddress = new JPanel();
        homeAddress.setLayout(new BoxLayout(homeAddress,BoxLayout.Y_AXIS));
        JLabel lAddress = new JLabel("Home address (number and street or rural route)");
        JTextField tAddress = new JTextField(15);
        lAddress.setAlignmentX(0);
        tAddress.setAlignmentX(0);
        homeAddress.add(lAddress);
        homeAddress.add(tAddress);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.weightx = 0.5;
        body.add(homeAddress, c);
        
        JPanel marriageStatus = new JPanel();
        marriageStatus.setLayout(new BoxLayout(marriageStatus,BoxLayout.Y_AXIS));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton single = new JRadioButton("Single");
        JRadioButton married = new JRadioButton("Married");
        JRadioButton married2 = new JRadioButton("Married, but withhold at higher Single rate.");
        buttons.add(new JLabel("<html><b>3 </b></html>"));
        buttons.add(single);
        buttons.add(married);
        buttons.add(married2);
        ButtonGroup exclusive = new ButtonGroup();
        exclusive.add(single);
        exclusive.add(married);
        exclusive.add(married2);
        JLabel note = new JLabel("<html><b>Note.</b> <tt><small>If married, but legally separated, or spouse is a nonresident alient, check the \"Single\" box.</small></tt>");
        buttons.setAlignmentX(0);
        note.setAlignmentX(0);
        marriageStatus.add(buttons);
        marriageStatus.add(note);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 4;
        c.weightx = 0.5;
        body.add(marriageStatus, c);
        
        line = new JSeparator();
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(line, c);
        
        // third row of body
        JPanel cityStateZip = new JPanel();
        cityStateZip.setLayout(new BoxLayout(cityStateZip, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("City or town, state, and ZIP code");
        JPanel cityStateZip2 = new JPanel();
        JTextField cityTown = new JTextField(10);
        JComboBox cStates = new JComboBox(states);
        JTextField zip = new JTextField(5);
        cityStateZip2.add(cityTown);
        cityStateZip2.add(cStates);
        cityStateZip2.add(zip);
        label.setAlignmentX(0);
        cityStateZip2.setAlignmentX(0);
        cityStateZip.add(label);
        cityStateZip.add(cityStateZip2);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 3;
        c.weightx = 0.5;
        body.add(cityStateZip, c);
        
        JPanel lastNameNote = new JPanel();
        JLabel diffNameNote = new JLabel("<html><b>4 If your last name differs from that shown on your social security card,<br> check the box on right. You must call 1-800-772-1213 for a replacement card.</b></html>");
        JCheckBox box = new JCheckBox();
        lastNameNote.add(diffNameNote);
        lastNameNote.add(box);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 3;
        c.weightx = 0.5;
        body.add(lastNameNote, c);
        
        line = new JSeparator();
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(line, c);
        
        // fourth row of body
        JPanel allowances = new JPanel();
        JLabel allowancesNote = new JLabel("<html><b>5  </b>Total number of allowances you are claiming. Click button on right to calculate.</html>");
        JLabel num = new JLabel(" ## ");
        JButton button = new JButton("Worksheet");
        allowances.add(allowancesNote);
        allowances.add(num);
        allowances.add(button);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(allowances, c);
        
        line = new JSeparator();
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(line, c);
        
        // fifth row of body
        JPanel additional = new JPanel();
        JLabel additionalNote = new JLabel("<html><b>6 </b>Additional amount, if any, you want to withheld from each paycheck. <b>$</b></html>");
        JTextField amount = new JTextField(7);
        additional.add(additionalNote);
        additional.add(amount);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(additional, c);
        
        line = new JSeparator();
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(line, c);
        
        // sixth row of body
        JPanel exempt = new JPanel();
        JLabel exemptNote = new JLabel("<html><b>7 </b>I claim exemption from withholding for 2013, and I certify that I meet <b>both</b> of the following conditions for exemption. <ul>  <li>Last year I had a right to a refund of <b>all</b> federal income tax withheld because I had <b>no</b> tax liability, <b>and</b></li>  <li>This year I expect a refund of <b>all</b> federal income tax withheld because I expect to have <b>no</b> tax liability.</li></ul> <br> If you meet both conditions, check the \"Exempt\" box on right.</html>");
        JCheckBox exemptBox = new JCheckBox("Exempt");
        exempt.add(exemptNote);
        exempt.add(exemptBox);
		
        c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        //        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 6;
        c.weightx = 0.5;
        body.add(exempt, c);
        
        JPanel bottom = new JPanel();
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.Y_AXIS));
		JLabel decl = new JLabel("Under penalties of perjury, I declare that I have examined this certificate and, to the best of my knowledge and belief, it is true, correct, and complete.");
		decl.setAlignmentX(0);
		bottom.add(decl);
		JPanel signAndDate = new JPanel();
		signAndDate.setLayout(new BoxLayout(signAndDate, BoxLayout.X_AXIS));
		signAndDate.setAlignmentX(0);
        //		signAndDate.setPreferredSize(new Dimension(500, 200));
		signAndDate.add(new JButton("Employee's signature"));
		signAndDate.add(new JLabel("<html>SIGNATURE HERE (This form is not valid unless you sign it.) </html>"));
        
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
        
		contentPane.add(firstRow, BorderLayout.NORTH);
		contentPane.add(body, BorderLayout.CENTER);
		contentPane.add(bottom, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		frame.setResizable(false);
		frame.setLocation(50, 50);
		frame.setVisible(true);
        
	}
    
}
