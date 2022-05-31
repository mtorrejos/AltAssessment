package com.gui;
import com.det.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class Homepage extends Login{
	
	String[] t;
	String[] u;
	
	public Homepage(String[] user, String[] time) {	//l: username, password, id; id, login date, login time, logout time
		getContentPane().removeAll();
        setBackground(new Color(255, 244, 228));
        setBounds(100, 100, 365, 655);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel label = new JLabel ("E-Guard");
		label.setBounds(130,38,200,50);
		label.setFont(new Font(null,Font.BOLD,30));
		label.setForeground(Color.black);
		add(label);
		
		 JLabel label2 = new JLabel ("Online Tracer");
		 label2.setBounds(138,60,200,50);
		 label2.setFont(new Font(null,Font.BOLD,15));
		 label2.setForeground(Color.black);
		 add(label2);
		
		ImageIcon pic = new ImageIcon("medeguard.png"); //medwelcome picture
		JLabel Picture = new JLabel(pic);
		add(Picture);
		Picture.setBounds(63,32,80,80);
		
		JLabel lblCode = new JLabel("UNIQUE CODE");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCode.setForeground(Color.black);
		lblCode.setBounds(55, 151, 236, 32);
		add(lblCode);
		
		JLabel lblActualCode = new JLabel();
		lblActualCode.setText(user[2]);
		lblActualCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualCode.setFont(new Font("Segoe UI Semibold", Font.BOLD, 50));
		lblActualCode.setForeground(Color.black);
		lblActualCode.setBounds(30, 210, 300, 69);
		add(lblActualCode);
		
		JButton btnAddtoDb = new JButton("Add to Dashboard");
		btnAddtoDb.setBounds(94, 375, 158, 41);
		setBtnProps(btnAddtoDb);
		if(user[2].charAt(0) == 'B')
			add(btnAddtoDb);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(94, 420, 158, 41);
		setBtnProps(btnDashboard);
		btnDashboard.addActionListener(dashboardListener);
		add(btnDashboard);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(94, 465, 158, 41);
		setBtnProps(btnProfile);
		btnProfile.addActionListener(profileListener);
		add(btnProfile);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.setBounds(94, 510, 158, 41);
		setBtnProps(btnLogout);
		btnLogout.addActionListener(backListener);
		add(btnLogout);
		
		setVisible(true);
		u = user;
		t = time;
		
	}
	
	ActionListener dashboardListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Dashboard dashboard = new Dashboard(u,t);
		}
	};
	
	
	ActionListener profileListener =new ActionListener () {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Profile profile = new Profile();
		}
	};
	
	
	ActionListener logoutListener(String[] user, String[] time) {
		String[] l = {"","",""};
		String line = "";
		try {
			File passFile = new File(pathPass);
			BufferedReader br = new BufferedReader(new FileReader(passFile)); 
			while(l[2]!=user[0]) {
				line = br.readLine();
				l = line.split(",");
			}
			File dateFile = new File(pathDate);
			BufferedReader dateReader = new BufferedReader(new FileReader(dateFile));
			FileWriter f = new FileWriter(pathDate,true);
			LocalTime timenow = LocalTime.now();
			DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
			time[3] = timenow.format(formatTime);
			if(br.readLine()!=null)
				f.write("\n");
			else
				f.write(time[0]+","+time[1]+","+time[2]+","+time[3]);
			f.close();
			
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
		return null;
	}
	
}