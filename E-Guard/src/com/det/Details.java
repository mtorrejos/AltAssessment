package com.det;

public class Details {
	private String fName,mName,lName,uAdd,uName,uPass;
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
	
	public String getDetails(){
		return getfName() + ", " + getmName() + ", " + getlName() + ", " + getuAdd() + ", " + getuName();
	}
}
