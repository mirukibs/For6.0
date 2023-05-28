[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/uIJCX1X-)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11214865&assignment_repo_type=AssignmentRepo)
# Lab Assignment: Library Management System

## Objective

The main goal of this assignment is to design and implement a simple library management system to reinforce your understanding of classes, objects, constructors, encapsulation, getters and setters, instance and local variables, and other concepts discussed in the last lecture.

## Description

You are required to create a simple Library Management System for a local library. Implement the following within the app/src/main/java/lab2 folder:

1. A `Book` class (`Book.java`) with the following fields:
   - title
   - author
   - ISBN (unique identifier)
   - isBorrowed (boolean value to keep track of whether the book is borrowed or not)

   This class should also have appropriate constructors, getters and setters, and a `toString()` method for printing book details.

2. A `Library` class (`Library.java`) which contains a list of `Book` objects. This class should have the following methods:
   - addBook: To add a new book to the library.
   - borrowBook: To mark a book as borrowed if it is not already borrowed.
   - returnBook: To mark a book as not borrowed.
   - printAllBooks: To print details of all the books in the library.
   - printAvailableBooks: To print details of all the books that are currently not borrowed.

## Requirements

1. Make sure to encapsulate your fields properly. Use the private access modifier for fields and provide public getters and setters where appropriate.

2. Use the `this` keyword where appropriate in your constructors and methods.

3. Make sure to handle the case where a book that is already borrowed is requested, or a book that is not borrowed is returned. In these cases, print an appropriate error message and do not update the status of the book.

## Submission

When finished, push your source code to your GitHub Classroom repository. The source code you add should demonstrate all the functionality of your library management system, including adding books, borrowing books, returning books, and printing book details.

## Grading (Total: 10)

1. Correct implementation of the `Book` class: 3
2. Correct implementation of the `Library` class (handling of special cases i.e. borrowing a borrowed book or returning a non-borrowed book): 5
3. Proper encapsulation of fields and methods: 2

Please remember, this is an individual assignment. You are expected to understand and do the assignment by yourself. Any evidence of plagiarism will result in a zero score for all parties involved.

## Hints

1. Remember, the ISBN of a book should be unique. You can use this property to identify which book to borrow or return in your `Library` class.
2. Don't forget to initialize your list of `Book` objects in your `Library` class before you start adding books.
3. You might find the `ArrayList` class in Java useful for maintaining a list of books in your `Library` class.

Good luck!
