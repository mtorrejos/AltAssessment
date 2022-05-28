package com.gui;

import java.awt.*;
import javax.swing.*;

public class Homepage extends Login{
	public Homepage() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setLayout(null);
		setBounds(100, 100, 375, 812);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCode = new JLabel("UNIQUE CODE");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCode.setBounds(55, 351, 236, 32);
		add(lblCode);
		
		JLabel lblActualCode = new JLabel(getUniqueID());
		lblActualCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualCode.setFont(new Font("Segoe UI Semibold", Font.BOLD, 47));
		lblActualCode.setBounds(55, 394, 236, 69);
		add(lblActualCode);
		
		JButton btnAddtoDb = new JButton("Add to Dashboard");
		btnAddtoDb.setBounds(94, 474, 158, 41);
		setBtnProps(btnAddtoDb);
		add(btnAddtoDb);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(118, 526, 112, 41);
		setBtnProps(btnDashboard);
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
	
	public String getUniqueID() {
		return "a";
	}
}
