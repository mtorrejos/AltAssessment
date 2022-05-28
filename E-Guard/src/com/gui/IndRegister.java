package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndRegister extends Login{

	public IndRegister() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 375, 812);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 257, 64, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblMidName = new JLabel("Middle Name:");
		lblMidName.setBounds(10, 313, 117, 14);
		getContentPane().add(lblMidName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 371, 64, 14);
		getContentPane().add(lblLastName);
		
		JTextField txtfName = new JTextField();
		txtfName.setBounds(20, 282, 305, 20);
		getContentPane().add(txtfName);
		
		JTextField txtmName = new JTextField();
		txtmName.setBounds(20, 338, 305, 20);
		getContentPane().add(txtmName);
		
		JTextField txtlName = new JTextField();
		txtlName.setBounds(20, 396, 305, 20);
		getContentPane().add(txtlName);
		
		JLabel lbluAdd = new JLabel("Complete Address:");
		lbluAdd.setBounds(10, 427, 140, 14);
		getContentPane().add(lbluAdd);
		
		JTextField txtuAdd = new JTextField();
		txtuAdd.setBounds(20, 452, 305, 20);
		getContentPane().add(txtuAdd);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 483, 64, 14);
		getContentPane().add(lblUsername);
		
		JTextField txtuName = new JTextField();
		txtuName.setBounds(20, 508, 305, 20);
		getContentPane().add(txtuName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 539, 64, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(10, 595, 140, 14);
		getContentPane().add(lblConfirmPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(38, 717, 89, 23);
		btnCancel.addActionListener(backListener);
		setBtnProps(btnCancel);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(clearListener);
		btnClear.setBounds(137, 717, 89, 23);
		setBtnProps(btnClear);
		getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(236, 717, 89, 23);
		btnClear.addActionListener(submitListener);
		setBtnProps(btnSubmit);
		getContentPane().add(btnSubmit);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(20, 564, 305, 20);
		getContentPane().add(passwordField);
		
		JPasswordField confirmpasswordField = new JPasswordField();
		confirmpasswordField.setBounds(20, 620, 305, 20);
		getContentPane().add(confirmpasswordField);
		
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
