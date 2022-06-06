package com.det;

import java.io.*;
import java.util.Random;

import com.gui.*;

public class Details extends Login{
	private String fName,mName,lName,uAdd,uName,cNum,uEmail,uPass,iID; //individual details
	private String busName,busNum,conPerson,conNum,landNum, bID;

	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNum() {
		return busNum;
	}
	public void setBusNum(String busNum) {
		this.busNum = busNum;
	}
	public String getConPerson() {
		return conPerson;
	}
	public void setConPerson(String conPerson) {
		this.conPerson = conPerson;
	}
	public String getConNum() {
		return conNum;
	}
	public void setConNum(String conNum) {
		this.conNum = conNum;
	}
	public String getLandNum() {
		return landNum;
	}
	public void setLandNum(String landNum) {
		this.landNum = landNum;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuAdd() {
		return uAdd;
	}
	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public void setiID() {
		Random rand = new Random(getuName().hashCode() * getcNum().hashCode());
		int leftLimit = 48;
		int rightLimit = 122;
		int targetLength = 6;
		String generatedString = rand.ints(leftLimit, rightLimit + 1).filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				.limit(targetLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		iID = "I-" + generatedString;
	}
	
	public String getiID() {
		return iID;
	}
	
	public void setbID() {
		Random rand = new Random(getBusName().hashCode() * getcNum().hashCode());
		int leftLimit = 48;
		int rightLimit = 122;
		int targetLength = 6;
		String generatedString = rand.ints(leftLimit, rightLimit + 1).filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
				.limit(targetLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		iID = "B-" + generatedString;
	}
	
	public String getbID() {
		return bID;
	}
	
	public void setiPass(String path) {
		try {
			FileWriter f = new FileWriter(path,true);
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			if(br.readLine()!=null)
				f.write("\n");
			f.write(getuName()+","+getuPass().toString() + "," + getiID());
			f.close();
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}

	public void setInd(String path) { //order of details: fname, mname, lname, add, username, c#, email
		try {
			
			FileWriter f = new FileWriter(path,true);
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			if(br.readLine()!=null)
				f.write("\n");
			f.write(getfName()+","+getmName()+","+getlName()+","+getuAdd()+","+getuName()+","+getcNum()+","+getuEmail());
			f.close();
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
	
	public void setBus(String path) { //order of details: busname, -, -, add, username, c#, email, cperson, busnum, landline
		try {
			
			FileWriter f = new FileWriter(path,true);
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			if(br.readLine()!=null)
				f.write("\n");
			f.write(getBusName()+","+ "null" +","+ "null" + ","+getuAdd()+","+getuName()+","+getcNum()+","+getuEmail() +"," + getConPerson()+
				"," + getBusNum() );
			f.close();
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
	


}	