package com.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Date;
import java.time.*;
import java.time.format.*;

import javax.imageio.*;
import javax.swing.*;

import com.det.Details;

public class Login extends JFrame{
	
	String uHome = System.getProperty("user.home");
	String fSeparator = System.getProperty("file.separator");
	//String pathInd = uHome + fSeparator + "Individuals.csv";
	//String pathBus = uHome + fSeparator + "Businesses.csv";
	String pathComb = uHome + fSeparator + "Combined.csv";
	String pathPass = uHome + fSeparator + "Passwords.csv";
	String pathDate = uHome + fSeparator + "Dates.csv";
	String pathIndData = uHome + fSeparator + "IndViewDatabase.csv";
	String pathBusData = uHome + fSeparator + "BusViewDatabase.csv";
	//String pathIndID = uHome + fSeparator + "Individual ID.csv";
	//String pathBusID = uHome + fSeparator + "Business ID.csv";
	//String pathCombID = uHome + fSeparator + "Combined ID.csv";
	String[] l = new String[3]; //array for username, password, and unique id
	String[] t = new String[4]; //array for id, date and times
	
	JPasswordField passwordField;
	JToggleButton tglbtnShowPass;
	JTextField txtuName;
	
	
	public static void main(String[] args) {
		Login gui = new Login();
	}
	
	public Login(){
		getContentPane().removeAll();
		setLocationRelativeTo(null);
		setTitle("E-Guard");
		setBackground(new Color(255, 244, 228));
		setLayout(null);
		setBounds(100, 100, 375, 812);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon iconimage= new ImageIcon("iconeguardlogo.png"); //creates an image icon
		setIconImage(iconimage.getImage());
		
	    
	    ImageIcon logpic = new ImageIcon("eguardlogo.png"); //login/register picture
	    JLabel LogPic = new JLabel(logpic);
	    add(LogPic);
	    LogPic.setBounds(55,38,250,250);
		
		JLabel label = new JLabel ("E-Guard");
		label.setBounds(52,260,900,80);
		label.setFont(new Font(null,Font.BOLD,65));
		label.setForeground(Color.black);
		add(label);
		
	//	add(new JLabel(new ImageIcon("E-GUARD LOGO.png"))); //i have no idea why this doesn't work
	          	
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
		
		//createFile(pathInd);
		//createFile(pathBus);
		createFile(pathComb);
		createFile(pathPass);
		createFile(pathDate);
		createFile(pathIndData);
		createFile(pathBusData);
		
		setVisible(true);
	}
	
	//Button Listeners
	ActionListener loginListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			boolean passScan = scanFile(pathPass);
			if(passScan) {
				LocalDate loginDate = LocalDate.now();
				LocalTime loginTime = LocalTime.now();
				DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				t[0] = l[2];
				t[1] = loginDate.format(formatDate);
				DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
				t[2] = loginTime.format(formatTime);
				
				Homepage hmpage = new Homepage(l,t);
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
			BusRegister busreg = new BusRegister();
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
		
		try {
			String password = new String(passwordField.getPassword());
			BufferedReader br=new BufferedReader(new FileReader(f));
			while((line=br.readLine())!=null) {
				l = line.split(",");
				String confirmPass = new String(l[1]);
				if(txtuName.getText().equals(l[0]) && confirmPass.equals(password)) {
					return true;
				}
			
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
