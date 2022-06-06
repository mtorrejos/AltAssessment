package com.gui;
import javax.swing.*;

import com.det.Details;

import java.awt.*;
import java.awt.event.*;

public class BusRegister extends Login {
	JTextField txtBusName,txtBusNum,txtConPerson,txtConNum,txtLandNum,txtuAdd,txtUserName,txtEmail;
	JPasswordField passwordField, confirmpasswordField;
	
	public BusRegister() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 365, 655);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		JLabel label = new JLabel ("Welcome to E-Guard!");
		label.setBounds(95,40,200,50);
		label.setFont(new Font(null,Font.BOLD,18));
		label.setForeground(Color.black);
		add(label);
		
		JLabel lblDesc1 = new JLabel("<html>Please fill-out the box below with your business information. " +
				"<br>Should match your registered business details submitted to BPLO." +
				"<br>2. Multiple registration is strictly prohibited. " + 
				"<br>3. For Support, email Eguard@support.ph</html>");
		lblDesc1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblDesc1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 9));
		lblDesc1.setBounds(38, 60, 287, 102);
		getContentPane().add(lblDesc1);
	
		ImageIcon pic = new ImageIcon("smalleguard.png"); //small welcome picture
		JLabel Picture = new JLabel(pic);
		add(Picture);
		Picture.setBounds(55,43,40,40);
    
		JLabel lblBusName = new JLabel("Business Name:");
		lblBusName.setBounds(22, 137, 100, 14);
		getContentPane().add(lblBusName);
	
		JLabel lblBusNum = new JLabel("Business Number:");
		lblBusNum.setBounds(22, 180, 117, 14);
		getContentPane().add(lblBusNum);
	
		JLabel lblConPerson = new JLabel("Contact Person:");
		lblConPerson.setBounds(22, 220, 100, 14);
		getContentPane().add(lblConPerson);
	
		txtBusName = new JTextField();
		txtBusName.setBounds(22, 155, 305, 20);
		getContentPane().add(txtBusName);
	
		txtBusNum = new JTextField();
		txtBusNum.setBounds(22, 197, 305, 20);
		getContentPane().add(txtBusNum);
	
		txtConPerson = new JTextField();
		txtConPerson.setBounds(22, 238, 305, 20);
		getContentPane().add(txtConPerson);
	
		JLabel lblConNum = new JLabel("Contact Number:");
		lblConNum.setBounds(22, 262, 140, 14);
		getContentPane().add(lblConNum);
	
		txtConNum = new JTextField();
		txtConNum.setBounds(22, 280, 305, 20);
		getContentPane().add(txtConNum);
	
		JLabel lblLandNum = new JLabel("Landline Number:");
		lblLandNum.setBounds(22, 302, 200, 14);
		getContentPane().add(lblLandNum);
	
		txtLandNum = new JTextField();
		txtLandNum.setBounds(22, 320, 305, 20);
		getContentPane().add(txtLandNum);
	
		JLabel lbluAdd = new JLabel("Complete Address:");
		lbluAdd.setBounds(22, 342, 305, 14);
		getContentPane().add(lbluAdd);
	
		txtuAdd = new JTextField();
		txtuAdd.setBounds(22, 360, 305, 20);
		getContentPane().add(txtuAdd);
	
		JLabel lblEmail = new JLabel("Email Address:");
		lblEmail.setBounds(22, 382, 100, 14);
		getContentPane().add(lblEmail);
	
		txtEmail = new JTextField();
		txtEmail.setBounds(22, 400, 305, 20);
		getContentPane().add(txtEmail);
	
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setBounds(22, 422, 140, 14);
		getContentPane().add(lblUserName);
	
		txtUserName = new JTextField();
		txtUserName.setBounds(22, 440, 305, 20);
		getContentPane().add(txtUserName);
	
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(22, 462, 140, 14);
		getContentPane().add(lblPassword);
	
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(22, 502, 140, 14);
		getContentPane().add(lblConfirmPassword);
	
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(22, 560, 89, 23);
		btnCancel.addActionListener(backListener);
		setBtnProps(btnCancel);
		getContentPane().add(btnCancel);
	
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(clearListener);
		btnClear.setBounds(130, 560, 89, 23);
		setBtnProps(btnClear);
		getContentPane().add(btnClear);
	
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(237,560, 89, 23);
		btnSubmit.addActionListener(submitListener);
		setBtnProps(btnSubmit);
		getContentPane().add(btnSubmit);
	
		passwordField = new JPasswordField();
		passwordField.setBounds(22, 480, 305, 20);
		getContentPane().add(passwordField);
	
		confirmpasswordField = new JPasswordField();
		confirmpasswordField.setBounds(22, 520, 305, 20);
		getContentPane().add(confirmpasswordField);
		
		JButton btnBack = new JButton("< Back");
		btnBack.addActionListener(backListener);
		btnBack.setBounds(10, 11, 70, 23);
		setBtnProps(btnBack);
		getContentPane().add(btnBack);
	}

	ActionListener clearListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			txtBusName.setText("");
			txtBusNum.setText("");
			txtConPerson.setText("");
			txtConNum.setText("");
			txtLandNum.setText("");
			txtuAdd.setText("");
			txtUserName.setText("");
			txtEmail.setText("");
			passwordField.setText("");
			confirmpasswordField.setText("");
		}	
	};

	ActionListener submitListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String password = new String(passwordField.getPassword());
			String confirmPassword = new String(confirmpasswordField.getPassword());
			if(txtBusName.getText().isBlank()||txtBusNum.getText().isBlank()
					||txtConPerson.getText().isBlank()||txtConNum.getText().isBlank()
					||txtLandNum.getText().isBlank()||txtuAdd.getText().isBlank()
					||txtUserName.getText().isBlank()||txtEmail.getText().isBlank()
					||passwordField.getPassword().length<1||confirmpasswordField.getPassword().length<1) {
				JOptionPane.showMessageDialog(null,"Error:\nPlease complete the form","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(!password.equals(confirmPassword)) {
				JOptionPane.showMessageDialog(null,"Error:\nPasswords don't correspond","Error",JOptionPane.ERROR_MESSAGE);
				//System.out.println(password);
				//System.out.println(confirmPassword);
			}
				
			else {
				Details person = new Details();
				person.setBusName(txtBusName.getText());
				person.setBusNum(txtBusNum.getText());
				person.setConPerson(txtConPerson.getText());
				person.setcNum(txtConNum.getText());
				person.setLandNum(txtLandNum.getText());
				person.setuAdd(txtuAdd.getText());
				person.setuEmail(txtEmail.getText());
				person.setuName(txtUserName.getText());
				person.setuPass(password);
				person.setbID();
				person.setBus(pathComb);
				person.setiPass(pathPass);
				JOptionPane.showMessageDialog(null,"Success:\nAccount Created. Please Login","Success",JOptionPane.DEFAULT_OPTION);
				dispose();
			}
		}	
	};
}