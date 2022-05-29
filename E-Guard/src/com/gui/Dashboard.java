package com.gui;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends Login{

	public Dashboard() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 375, 812);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		if(t[2].charAt(0) == 'I') {
			
			File file = new File(pathIndData);	
			String line = "";
			String[] columns = {"DATE","TIME","PLACE","TYPE","TEMP","# of PEOPLE"};
			String[] data;

			JTable table = new JTable(new DefaultTableModel(null, columns));		
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				while ((line = br.readLine()) != null) {
					data = line.split(",");
					model.addRow(data);	
				}
			}
			
			catch(Exception err) {
				err.getStackTrace();
			}
			
			JLabel lblNewLabel = new JLabel("Number of Visitors During Time Interval:");
			lblNewLabel.setBounds(20, 724, 273, 14);
			getContentPane().add(lblNewLabel);
		}
		
		else {
			File file = new File(pathBusData);	
			String line = "";
			String[] columns = {"DATE","TYPE","CONTACT PERSON","ADDRESS","CONTACT #","TEMP"};
			String[] data;

			JTable table = new JTable(new DefaultTableModel(null, columns));		
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				while ((line = br.readLine()) != null) {
					data = line.split(",");
					model.addRow(data);	
				}
			}
			
			catch(Exception err) {
				err.getStackTrace();
			}
		}
			
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setBounds(10, 11, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(303, 724, 46, 14);
		getContentPane().add(lblNewLabel_1);
	}
}
