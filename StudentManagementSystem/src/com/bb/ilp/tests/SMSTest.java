package com.bb.ilp.tests;

import com.bb.ilp.beans.Author;
import com.bb.ilp.beans.Book;
import com.bb.ilp.service.StudentManagementService;

public class SMSTest {
	public static void main(String[] args) {

		Book book1 = new Book(1, "Algorithms by ex", "ADA", "Cormen");
		Book book2 = new Book(2, "Data Structures made easy", "Data structures", "Hewitt");
		Book book3 = new Book(3, "Java Complete reference", "Java", "Herbert shield");

		Author author1 = new Author(1, "Cormen", (byte) 26, "Sec 31 ggn", book1);
		Author author2 = new Author(1, "Hewitt", (byte) 27, "Sec 17 punjab", book2);
		Author author3 = new Author(1, "Herbert shield", (byte) 35, "Sec 14 delhi", book3);

		StudentManagementService studentManagementService = new StudentManagementService();

		System.out.println("------- Displaying book details start--------");
		studentManagementService.displayBookDetails(book1);
		System.out.println("------- Displaying book details end--------");
		
		System.out.println();

		System.out.println("------- Displaying author details start--------");
		studentManagementService.displayAuthorDetails(author1);
		System.out.println("------- Displaying author details end--------");

		System.out.println();
		
		System.out.println("------- Displaying book details start--------");
		studentManagementService.displayBookDetails(book2);
		System.out.println("------- Displaying book details end--------");
		
		System.out.println();

		System.out.println("------- Displaying author details start--------");
		studentManagementService.displayAuthorDetails(author2);
		System.out.println("------- Displaying author details end--------");
		
		System.out.println();

		System.out.println("------- Displaying book details start--------");
		studentManagementService.displayBookDetails(book3);
		System.out.println("------- Displaying book details end--------");
		
		System.out.println();

		System.out.println("------- Displaying author details start--------");
		studentManagementService.displayAuthorDetails(author3);
		System.out.println("------- Displaying author details end--------");

	}

}
