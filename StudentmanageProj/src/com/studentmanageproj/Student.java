package com.studentmanageproj;

public class Student {
 private int studentId;
 private String studentName;
 private String studentphone;
 private String studentCity;
public Student(int studentId, String studentName, String studentphone, String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentphone = studentphone;
	this.studentCity = studentCity;
}
public Student(String studentName, String studentphone, String studentCity) {
	super();
	this.studentName = studentName;
	this.studentphone = studentphone;
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentphone() {
	return studentphone;
}
public void setStudentphone(String studentphone) {
	this.studentphone = studentphone;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentphone=" + studentphone
			+ ", studentCity=" + studentCity + "]";
	
	
	
}
 
}
