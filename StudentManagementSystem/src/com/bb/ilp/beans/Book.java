package com.bb.ilp.beans;

public class Book {

	private long bookId;
	private String bookName;
	private String subjectName;
	private String authorName;

	public Book(long bookId, String bookName, String subjectName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.subjectName = subjectName;
		this.authorName = authorName;
	}


	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
