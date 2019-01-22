package com.bb.ilp.beans;

import java.util.ArrayList;

public class Standard {
	
	private int standardNumber;
	private int numberOfStudents;
	private Teacher classTeahcer;
	private ArrayList<Subject> listOfSubjects;
	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Standard(int standardNumber, int numberOfStudents, Teacher classTeahcer, ArrayList<Subject> listOfSubjects) {
		super();
		this.standardNumber = standardNumber;
		this.numberOfStudents = numberOfStudents;
		this.classTeahcer = classTeahcer;
		this.listOfSubjects = listOfSubjects;
	}
	public int getStandardNumber() {
		return standardNumber;
	}
	public void setStandardNumber(int standardNumber) {
		this.standardNumber = standardNumber;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public Teacher getClassTeahcer() {
		return classTeahcer;
	}
	public void setClassTeahcer(Teacher classTeahcer) {
		this.classTeahcer = classTeahcer;
	}
	public ArrayList<Subject> getListOfSubjects() {
		return listOfSubjects;
	}
	public void setListOfSubjects(ArrayList<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}
	
	

}
