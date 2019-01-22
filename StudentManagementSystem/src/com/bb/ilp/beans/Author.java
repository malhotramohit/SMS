package com.bb.ilp.beans;

public class Author {

	private long authorId;
	private String authorName;
	private byte authorAge;
	private String authorAddress;
	private Book book;


	public Author(long authorId, String authorName, byte authorAge, String authorAddress, Book book) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorAge = authorAge;
		this.authorAddress = authorAddress;
		this.book = book;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public byte getAuthorAge() {
		return authorAge;
	}

	public void setAuthorAge(byte authorAge) {
		this.authorAge = authorAge;
	}

	public String getAuthorAddress() {
		return authorAddress;
	}

	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
