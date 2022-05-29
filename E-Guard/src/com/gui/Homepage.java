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
	
	public Homepage(String[] user, String[] time) {	//l: username, password, id; id, login date, login time, logout time
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setLayout(null);
		setBounds(100, 100, 375, 812);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCode = new JLabel("UNIQUE CODE");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCode.setBounds(55, 351, 236, 32);
		add(lblCode);
		
		JLabel lblActualCode = new JLabel();
		lblActualCode.setText(user[2]);
		lblActualCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualCode.setFont(new Font("Segoe UI Semibold", Font.BOLD, 47));
		lblActualCode.setBounds(55, 394, 236, 69);
		add(lblActualCode);
		
		JButton btnAddtoDb = new JButton("Add to Dashboard");
		btnAddtoDb.setBounds(94, 474, 158, 41);
		setBtnProps(btnAddtoDb);
		if(user[2].charAt(0) == 'B')
			add(btnAddtoDb);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(118, 526, 112, 41);
		setBtnProps(btnDashboard);
		btnDashboard.addActionListener(dashboardListener);
		add(btnDashboard);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(118, 578, 112, 41);
		setBtnProps(btnProfile);
		add(btnProfile);
		
		JButton btnLogout = new JButton("Log-out");
		btnLogout.setBounds(118, 630, 112, 41);
		setBtnProps(btnLogout);
		btnLogout.addActionListener(backListener);
		add(btnLogout);
		
		setVisible(true);
		
	}
	
	ActionListener dashboardListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Dashboard dashboard = new Dashboard();
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
