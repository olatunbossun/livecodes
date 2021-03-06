package com.vas.home;

import java.util.Date;

public class Vascon {
	private int id ;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String comment;
	private Date dob;
	
public int getId(){
	return id;
}
public void setId(int id){
	this.id=id;
}
public String getFirstName(){
	return firstName;
}
public void setFirstName(String firstName){
	this.firstName=firstName;
}
public String getLastName(){
	return lastName;
}
public void setLastName(String lastName){
	this.lastName=lastName;
}
public String getEmail(){
	return email;
}
public void setEmail(String email){
	this.email=email;
}
public String getPassword(){
	return password;
}
public void setPassword(String password){
	this.password=password;
}
public String getComment(){
	return comment;
}
public void setComment(String comment){
	this.comment=comment;
}
public Date getDob(){
	return dob;
}
public void setDob(Date dob){
	this.dob=dob;
}


@Override
public String toString(){
	return "Vascon [ID = " +id+", FIRSTNAME = " +firstName+ ", LASTNAME = " +lastName+", EMAIL= "+email+ ", PASSWORD= "+password+", COMMENT= "+comment+", DOB= "+dob+"]";
}


}
