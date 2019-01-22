package com.bb.ilp.beans;

public class Teacher {
	private long teacherId;
	private byte teacherAge;
	private String teacherName;
	private int yearOfExpl;
	private String specialisation;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(long teacherId, byte teacherAge, String teacherName, int yearOfExpl, String specialisation) {
		super();
		this.teacherId = teacherId;
		this.teacherAge = teacherAge;
		this.teacherName = teacherName;
		this.yearOfExpl = yearOfExpl;
		this.specialisation = specialisation;
	}

	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public byte getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(byte teacherAge) {
		this.teacherAge = teacherAge;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getYearOfExpl() {
		return yearOfExpl;
	}

	public void setYearOfExpl(int yearOfExpl) {
		this.yearOfExpl = yearOfExpl;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

}
