package com.det;

import java.io.*;
import com.gui.*;

public class Details extends Login{
	private String fName,mName,lName,uAdd,uName,uPass,cNum,uEmail;
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
	private String uID;

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
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public void setInd(String path) { //order of details: fname, mname, lname, add, c#, email
		try {
			
			FileWriter f = new FileWriter(path,true);
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.readLine() != null) {
				f.write("\n");
			}
			f.write(getfName()+", "+getmName()+", "+getlName()+", "+getuAdd()+", "+getuName()+", "+getcNum()+", "+getuEmail());
			f.close();
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
	public void setBus(String path) {
		
	}
	public void setfPass(String path) {
		try {
			FileWriter f = new FileWriter(path,true);
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.readLine() != null) {
				f.write("\n");
			}
			f.write(getuName()+", "+getuPass());
			f.close();
		} 
		catch (IOException e) {
			System.out.println("Couldn't write to file");
			e.printStackTrace();
		}
	}
}
