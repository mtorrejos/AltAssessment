package com.gui;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Profile extends Login{
	String passLine = "";
	String pflLine = "";
	String pflString = "";
	String[] pflRead = new String[3];
	String[] pflDets = new String[9];
	
	public Profile(String[] l) {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 375, 812);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.l = l;

		if(l[2].charAt(0) == 'B') {
			
			readDets(pathPass, pathComb);
			
			JLabel lblName = new JLabel("Business Name:");
			lblName.setBounds(30, 105, 169, 14);
			getContentPane().add(lblName);
			
			JLabel lblProfile = new JLabel("Profile");
			lblProfile.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
			lblProfile.setBounds(129, 54, 70, 41);
			getContentPane().add(lblProfile);
			
			JLabel modbName = new JLabel(pflDets[0]);
			modbName.setBounds(40, 130, 242, 14);
			getContentPane().add(modbName);
			
			JLabel lblBusinessNumber = new JLabel("Business Number:");
			lblBusinessNumber.setBounds(30, 155, 169, 14);
			getContentPane().add(lblBusinessNumber);
			
			JLabel modbNum = new JLabel(pflDets[5]);
			modbNum.setBounds(40, 180, 242, 14);
			getContentPane().add(modbNum);
			
			JLabel lblcNum = new JLabel("Contact Number:");
			lblcNum.setBounds(30, 255, 169, 14);
			getContentPane().add(lblcNum);
			
			JLabel modcNum = new JLabel(pflDets[8]);
			modcNum.setBounds(40, 280, 242, 14);
			getContentPane().add(modcNum);
			
			JLabel modcPers = new JLabel(pflDets[7]);
			modcPers.setBounds(40, 230, 242, 14);
			getContentPane().add(modcPers);
			
			JLabel lblContactPerson = new JLabel("Contact Person:");
			lblContactPerson.setBounds(30, 205, 169, 14);
			getContentPane().add(lblContactPerson);
			
			JLabel moduName = new JLabel(pflDets[4]);
			moduName.setBounds(40, 480, 242, 14);
			getContentPane().add(moduName);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("Username:");
			lblNewLabel_3_1_1.setBounds(30, 455, 169, 14);
			getContentPane().add(lblNewLabel_3_1_1);
			
			JLabel modEmail = new JLabel(pflDets[6]);
			modEmail.setBounds(40, 430, 242, 14);
			getContentPane().add(modEmail);
			
			JLabel lblNewLabel_4_1 = new JLabel("Email:");
			lblNewLabel_4_1.setBounds(30, 405, 169, 14);
			getContentPane().add(lblNewLabel_4_1);
			
			JLabel moduAdd = new JLabel(pflDets[3]);
			moduAdd.setBounds(40, 380, 242, 14);
			getContentPane().add(moduAdd);
			
			JLabel lblNewLabel_3_2 = new JLabel("Complete Address:");
			lblNewLabel_3_2.setBounds(30, 355, 169, 14);
			getContentPane().add(lblNewLabel_3_2);
			
			JLabel lblNewLabel_2_3 = new JLabel(pflDets[5]);
			lblNewLabel_2_3.setBounds(40, 330, 242, 14);
			getContentPane().add(lblNewLabel_2_3);
			
			JLabel lblLandline = new JLabel("Landline:");
			lblLandline.setBounds(30, 305, 169, 14);
			getContentPane().add(lblLandline);
			
		}
		
		else {
			
			readDets(pathPass, pathComb);
			
			JLabel lblfName = new JLabel("First Name:");
			lblfName.setBounds(30, 105, 169, 14);
			getContentPane().add(lblfName);
			
			JLabel lblProfile = new JLabel("Profile");
			lblProfile.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 24));
			lblProfile.setBounds(129, 54, 70, 41);
			getContentPane().add(lblProfile);
			
			JLabel modfName = new JLabel(pflDets[0]);
			modfName.setBounds(40, 130, 242, 14);
			getContentPane().add(modfName);
			
			JLabel lblBusinessNumber = new JLabel("Middle Name:");
			lblBusinessNumber.setBounds(30, 155, 169, 14);
			getContentPane().add(lblBusinessNumber);
			
			JLabel modmName = new JLabel(pflDets[1]);
			modmName.setBounds(40, 180, 242, 14);
			getContentPane().add(modmName);
			
			JLabel lblcNum = new JLabel("Contact Number:");
			lblcNum.setBounds(30, 305, 169, 14);
			getContentPane().add(lblcNum);
			
			JLabel modcNum = new JLabel(pflDets[5]);
			modcNum.setBounds(40, 330, 242, 14);
			getContentPane().add(modcNum);
			
			JLabel modlName = new JLabel(pflDets[2]);
			modlName.setBounds(40, 230, 242, 14);
			getContentPane().add(modlName);
			
			JLabel lblContactPerson = new JLabel("Last Name:");
			lblContactPerson.setBounds(30, 205, 169, 14);
			getContentPane().add(lblContactPerson);
			
			JLabel moduName = new JLabel(pflDets[4]);
			moduName.setBounds(40, 430, 242, 14);
			getContentPane().add(moduName);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("Username:");
			lblNewLabel_3_1_1.setBounds(30, 405, 169, 14);
			getContentPane().add(lblNewLabel_3_1_1);
			
			JLabel modEmail = new JLabel(pflDets[6]);
			modEmail.setBounds(40, 380, 242, 14);
			getContentPane().add(modEmail);
			
			JLabel lblNewLabel_4_1 = new JLabel("Email:");
			lblNewLabel_4_1.setBounds(30, 355, 169, 14);
			getContentPane().add(lblNewLabel_4_1);
			
			JLabel moduAdd = new JLabel(pflDets[3]);
			moduAdd.setBounds(40, 280, 242, 14);
			getContentPane().add(moduAdd);
			
			JLabel lblNewLabel_3_2 = new JLabel("Complete Address:");
			lblNewLabel_3_2.setBounds(30, 255, 169, 14);
			getContentPane().add(lblNewLabel_3_2);
			
			JLabel lblNewLabel_3 = new JLabel("Password:");
			lblNewLabel_3.setBounds(30, 455, 85, 14);
			getContentPane().add(lblNewLabel_3);
			
			JLabel modPass = new JLabel("<Password>");
			modPass.setBounds(40, 480, 176, 14);
			getContentPane().add(modPass);
		}
		
		JButton btnNewButton = new JButton("Edit Profile");
		btnNewButton.setBounds(105, 526, 111, 30);
		getContentPane().add(btnNewButton);
		
	}
	
	public void readDets(String pathPass, String pathComb) {
		File idFile = new File(pathPass);
		File profileFile = new File(pathComb);
		try {
			BufferedReader idbr=new BufferedReader(new FileReader(idFile));
			BufferedReader prfbr=new BufferedReader(new FileReader(profileFile));
			for(int i = 0; (passLine = idbr.readLine()) != null; i++ ) {
				pflRead = passLine.split(",");
				if(pflRead[2].equals(l[2])) {
					for(int j = 0; j <= i; j++) {
						pflString = prfbr.readLine();
					}
					pflDets = pflString.split(",");
				}
			}
		}
		
		catch(IOException e) {
			System.out.println("Error");
		}
	}
	
}
