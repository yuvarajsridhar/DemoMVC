package com.yuvaraj.model;

import lombok.Data;

@Data
public class User {
   String name;
   String lastName;
   String emailId;
   int mNum;
   String Password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getmNum() {
	return mNum;
}
public void setmNum(int mNum) {
	this.mNum = mNum;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
   
}
