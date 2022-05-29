package com.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Profile extends Login{
	public Profile() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 375, 812);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		if(l[2].charAt(0) == 'B') {
			JLabel lblNewLabel = new JLabel("Business Name:");
			lblNewLabel.setBounds(30, 105, 169, 14);
			getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Profile");
			lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
			lblNewLabel_1.setBounds(129, 54, 70, 41);
			getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("<Business>");
			lblNewLabel_2.setBounds(40, 130, 242, 14);
			getContentPane().add(lblNewLabel_2);
			
			JLabel lblBusinessNumber = new JLabel("Business Number:");
			lblBusinessNumber.setBounds(30, 155, 169, 14);
			getContentPane().add(lblBusinessNumber);
			
			JLabel lblNewLabel_2_1 = new JLabel("<Number>");
			lblNewLabel_2_1.setBounds(40, 180, 242, 14);
			getContentPane().add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_3_1 = new JLabel("Contact Number:");
			lblNewLabel_3_1.setBounds(30, 255, 169, 14);
			getContentPane().add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("<Number>");
			lblNewLabel_2_1_1.setBounds(40, 280, 242, 14);
			getContentPane().add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_2 = new JLabel("<PErson>");
			lblNewLabel_2_2.setBounds(40, 230, 242, 14);
			getContentPane().add(lblNewLabel_2_2);
			
			JLabel lblContactPerson = new JLabel("Contact Person:");
			lblContactPerson.setBounds(30, 205, 169, 14);
			getContentPane().add(lblContactPerson);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("<Username>");
			lblNewLabel_2_1_1_1.setBounds(40, 480, 242, 14);
			getContentPane().add(lblNewLabel_2_1_1_1);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("Username:");
			lblNewLabel_3_1_1.setBounds(30, 455, 169, 14);
			getContentPane().add(lblNewLabel_3_1_1);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("<Email>");
			lblNewLabel_2_2_1.setBounds(40, 430, 242, 14);
			getContentPane().add(lblNewLabel_2_2_1);
			
			JLabel lblNewLabel_4_1 = new JLabel("Email:");
			lblNewLabel_4_1.setBounds(30, 405, 169, 14);
			getContentPane().add(lblNewLabel_4_1);
			
			JLabel lblNewLabel_2_1_2 = new JLabel("<Address>");
			lblNewLabel_2_1_2.setBounds(40, 380, 242, 14);
			getContentPane().add(lblNewLabel_2_1_2);
			
			JLabel lblNewLabel_3_2 = new JLabel("Complete Address:");
			lblNewLabel_3_2.setBounds(30, 355, 169, 14);
			getContentPane().add(lblNewLabel_3_2);
			
			JLabel lblNewLabel_2_3 = new JLabel("<Number>");
			lblNewLabel_2_3.setBounds(40, 330, 242, 14);
			getContentPane().add(lblNewLabel_2_3);
			
			JLabel lblLandline = new JLabel("Landline:");
			lblLandline.setBounds(30, 305, 169, 14);
			getContentPane().add(lblLandline);
			
		}
		
		else {
			JLabel lblNewLabel = new JLabel("First Name:");
			lblNewLabel.setBounds(30, 105, 169, 14);
			getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Profile");
			lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
			lblNewLabel_1.setBounds(129, 54, 70, 41);
			getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("<fname>");
			lblNewLabel_2.setBounds(40, 130, 242, 14);
			getContentPane().add(lblNewLabel_2);
			
			JLabel lblBusinessNumber = new JLabel("Middle Name:");
			lblBusinessNumber.setBounds(30, 155, 169, 14);
			getContentPane().add(lblBusinessNumber);
			
			JLabel lblNewLabel_2_1 = new JLabel("<mname>");
			lblNewLabel_2_1.setBounds(40, 180, 242, 14);
			getContentPane().add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_3_1 = new JLabel("Contact Number:");
			lblNewLabel_3_1.setBounds(30, 305, 169, 14);
			getContentPane().add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("<Number>");
			lblNewLabel_2_1_1.setBounds(40, 330, 242, 14);
			getContentPane().add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_2 = new JLabel("<lname>");
			lblNewLabel_2_2.setBounds(40, 230, 242, 14);
			getContentPane().add(lblNewLabel_2_2);
			
			JLabel lblContactPerson = new JLabel("Last Name:");
			lblContactPerson.setBounds(30, 205, 169, 14);
			getContentPane().add(lblContactPerson);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("<Username>");
			lblNewLabel_2_1_1_1.setBounds(40, 430, 242, 14);
			getContentPane().add(lblNewLabel_2_1_1_1);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("Username:");
			lblNewLabel_3_1_1.setBounds(30, 405, 169, 14);
			getContentPane().add(lblNewLabel_3_1_1);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("<Email>");
			lblNewLabel_2_2_1.setBounds(40, 380, 242, 14);
			getContentPane().add(lblNewLabel_2_2_1);
			
			JLabel lblNewLabel_4_1 = new JLabel("Email:");
			lblNewLabel_4_1.setBounds(30, 355, 169, 14);
			getContentPane().add(lblNewLabel_4_1);
			
			JLabel lblNewLabel_2_1_2 = new JLabel("<Address>");
			lblNewLabel_2_1_2.setBounds(40, 280, 242, 14);
			getContentPane().add(lblNewLabel_2_1_2);
			
			JLabel lblNewLabel_3_2 = new JLabel("Complete Address:");
			lblNewLabel_3_2.setBounds(30, 255, 169, 14);
			getContentPane().add(lblNewLabel_3_2);
			
			JLabel lblNewLabel_3 = new JLabel("Password:");
			lblNewLabel_3.setBounds(30, 455, 85, 14);
			getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("<Password>");
			lblNewLabel_4.setBounds(40, 480, 176, 14);
			getContentPane().add(lblNewLabel_4);
		}
		
		JButton btnNewButton = new JButton("Edit Profile");
		btnNewButton.setBounds(105, 526, 111, 30);
		getContentPane().add(btnNewButton);
	}
}
