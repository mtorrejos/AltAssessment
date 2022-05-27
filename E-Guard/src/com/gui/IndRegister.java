package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndRegister extends Login{

	public IndRegister() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 455, 746);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(29, 195, 64, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblMidName = new JLabel("Middle Name:");
		lblMidName.setBounds(29, 251, 117, 14);
		getContentPane().add(lblMidName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(29, 309, 64, 14);
		getContentPane().add(lblLastName);
		
		JTextField textField = new JTextField();
		textField.setBounds(39, 220, 305, 20);
		getContentPane().add(textField);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(39, 278, 305, 20);
		getContentPane().add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(39, 334, 305, 20);
		getContentPane().add(textField_2);
		
		JLabel lbluAdd = new JLabel("Complete Address:");
		lbluAdd.setBounds(29, 365, 140, 14);
		getContentPane().add(lbluAdd);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(39, 390, 305, 20);
		getContentPane().add(textField_3);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(29, 421, 64, 14);
		getContentPane().add(lblUsername);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(39, 446, 305, 20);
		getContentPane().add(textField_4);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(29, 477, 64, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(29, 533, 140, 14);
		getContentPane().add(lblConfirmPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(57, 655, 89, 23);
		btnCancel.addActionListener(backListener);
		setBtnProps(btnCancel);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(clearListener);
		btnClear.setBounds(156, 655, 89, 23);
		setBtnProps(btnClear);
		getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(255, 655, 89, 23);
		btnClear.addActionListener(submitListener);
		setBtnProps(btnSubmit);
		getContentPane().add(btnSubmit);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(39, 502, 305, 20);
		getContentPane().add(passwordField);
		
		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(39, 558, 305, 20);
		getContentPane().add(passwordField_1);
		
		JButton btnBack = new JButton("< Back");
		btnBack.addActionListener(backListener);
		btnBack.setBounds(10, 11, 89, 23);
		setBtnProps(btnBack);
		getContentPane().add(btnBack);
	}

	ActionListener clearListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	};
	
	ActionListener submitListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	};
}
