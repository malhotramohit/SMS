package com.bb.ilp.service;

import com.bb.ilp.beans.Author;
import com.bb.ilp.beans.Book;

public class StudentManagementService {

	public void displayAuthorDetails(Author author) {

		System.out.println("Author id is : " + author.getAuthorId());
		System.out.println("Author name is : " + author.getAuthorName());
		System.out.println("Author age is : " + author.getAuthorAge());
		System.out.println("Author address is : " + author.getAuthorAddress());
		System.out.println("Author has written book : " + author.getBook().getBookName());

	}

	public void displayBookDetails(Book book) {

		System.out.println("Book id is : " + book.getBookId());
		System.out.println("Book name is : " + book.getBookName());
		System.out.println("Book subject is : " + book.getSubjectName());
		System.out.println("Book is written by : " + book.getAuthorName());

	}

}
