package com.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Login extends JFrame{
	
	String uHome = System.getProperty("user.home");
	String fSeparator = System.getProperty("file.separator");
	String pathInd = uHome + fSeparator + "Individuals.csv";
	String pathBus = uHome + fSeparator + "Businesses.csv";
	String pathPass = uHome + fSeparator + "Passwords.csv";

	JPasswordField passwordField;
	JToggleButton tglbtnShowPass;
	JTextField txtuName;
	String[] l = new String[3];
	
	public static void main(String[] args) {
		Login gui = new Login();
	}
	
	public Login(){
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setLayout(null);
		setBounds(100, 100, 375, 812);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JLabel(new ImageIcon("E-GUARD LOGO.png"))); //i have no idea why this doesn't work
	          	
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(21, 464, 110, 14);
		add(lblUsername);
		
		txtuName = new JTextField();
		txtuName.setBounds(31, 489, 306, 20);
		add(txtuName);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(21, 520, 89, 14);
		add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(31, 539, 306, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(loginListener);
		btnLogin.setBounds(138, 604, 89, 23);
		setBtnProps(btnLogin);
		add(btnLogin);
		
		JButton btnRegInd = new JButton("Register as Individual");
		btnRegInd.addActionListener(indListener);
		btnRegInd.setBounds(21, 638, 157, 58);
		setBtnProps(btnRegInd);
		add(btnRegInd);
		
		JButton btnRegBus = new JButton("Register as Business");
		btnRegBus.addActionListener(busListener);
		btnRegBus.setBounds(188, 638, 149, 58);
		setBtnProps(btnRegBus);
		add(btnRegBus);
		
		tglbtnShowPass = new JToggleButton("Show Password");
		tglbtnShowPass.setBounds(31, 570, 140, 23);
		tglbtnShowPass.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		tglbtnShowPass.setForeground(Color.WHITE);
		tglbtnShowPass.setBackground(new Color(6,10,81));
		tglbtnShowPass.addActionListener(showPass);
		add(tglbtnShowPass);
		
		createFile(pathInd);
		createFile(pathBus);
		createFile(pathPass);
		
		setVisible(true);
	}
	
	//Button Listeners
	ActionListener loginListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean passScan = scanFile(pathPass);
			if(passScan) {
				Homepage hmpage = new Homepage();
				dispose();
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Error:\nInvalid Username or Password","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	};
	
	//to individual register
	ActionListener indListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			IndRegister indreg = new IndRegister();
		}	
	};
	
	//to business register
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
			try {
				AbstractButton abstractButton = (AbstractButton) e.getSource();
				boolean selected = abstractButton.getModel().isSelected();
				if(selected)
					passwordField.setEchoChar((char)0);
				else
					passwordField.setEchoChar('\u2022');
			}

			catch(NullPointerException nullErr) {
				tglbtnShowPass.setSelected(false);	
			}
		}	
	};
	
	
	//back button
	ActionListener backListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Login gui = new Login();
		}
	};
	
//methods
	//button properties, default
	public void setBtnProps(JButton btn) {
		btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(6,10,81));
	}

	//password scan
	public boolean scanFile(String path){
		File f=new File(path);
		String line = "";
		String passString = "";
		try {
			passString = new String(passwordField.getPassword());
			BufferedReader br=new BufferedReader(new FileReader(f));
			while((line=br.readLine())!=null) {
				l = line.split(",");
				if(txtuName.getText().equals(l[0]) && passString.equals(l[1]))
					return true;
			
				else
					continue;
				
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	//file creation
	public void createFile(String path) {
		try {
		      File f = new File(path);
		      if (f.createNewFile())
		        System.out.println("File created: " + path);
		      else
		        System.out.println("File already exists: " + path);
		    } 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
