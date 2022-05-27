package com.gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame{
	
	JPasswordField passwordField;
	JTextField showPasswordField;
	
	public static void main(String[] args) {
		Login initialize = new Login();
	}
	
	public Login() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setLayout(null);
		setBounds(100, 100, 450, 665);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(42, 305, 110, 14);
		add(lblUsername);
		
		JTextField textField = new JTextField();
		textField.setBounds(52, 330, 306, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(42, 361, 89, 14);
		add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(52, 386, 306, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(loginListener);
		btnLogin.setBounds(159, 445, 89, 23);
		setBtnProps(btnLogin);
		add(btnLogin);
		
		JButton btnRegInd = new JButton("Register as Individual");
		btnRegInd.addActionListener(indListener);
		btnRegInd.setBounds(42, 479, 157, 58);
		setBtnProps(btnRegInd);
		add(btnRegInd);
		
		JButton btnRegBus = new JButton("Register as Business");
		btnRegBus.addActionListener(busListener);
		btnRegBus.setBounds(209, 479, 149, 58);
		setBtnProps(btnRegBus);
		add(btnRegBus);
		
		JToggleButton tglbtnShowPass = new JToggleButton("Show Password");
		tglbtnShowPass.setBounds(52, 411, 140, 23);
		tglbtnShowPass.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		tglbtnShowPass.setForeground(Color.WHITE);
		tglbtnShowPass.setBackground(new Color(6,10,81));
		tglbtnShowPass.addActionListener(showPass);
		add(tglbtnShowPass);
		
		setVisible(true);
	}
	
	//Button Listeners
	ActionListener loginListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Homepage hmpage = new Homepage();
		}	
	};
	
	ActionListener indListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			IndRegister indreg = new IndRegister();
		}	
	};
	
	ActionListener busListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}	
	};
	
	//show password
	ActionListener showPass = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			AbstractButton abstractButton = (AbstractButton) e.getSource();
			boolean selected = abstractButton.getModel().isSelected();
			if(selected)
				passwordField.setEchoChar((char)0);
			else
				passwordField.setEchoChar('\u2022');
		}	
	};
	
	ActionListener backListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Login initialize = new Login();
		}
	};
	
	//button properties, default
	public void setBtnProps(JButton btn) {
		btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(6,10,81));
	}
	
	
	
}
