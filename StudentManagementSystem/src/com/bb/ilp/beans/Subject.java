package com.bb.ilp.beans;

public class Subject {

	private long subjectdId;
	private String subjectName;
	private Book book;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(long subjectdId, String subjectName, Book book) {
		super();
		this.subjectdId = subjectdId;
		this.subjectName = subjectName;
		this.book = book;
	}

	public long getSubjectdId() {
		return subjectdId;
	}

	public void setSubjectdId(long subjectdId) {
		this.subjectdId = subjectdId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
