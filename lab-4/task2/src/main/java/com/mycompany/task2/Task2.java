/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2;

class LibraryItem {
   
    final String itemId;
    
    static int totalItems = 0;
    
    LibraryItem(String itemId) {
        this.itemId = itemId;
        totalItems++; 
    }

    static int getTotalItemCount() {
        return totalItems;
    }
}

class Book extends LibraryItem {
    String title;
    String author;

    Book(String itemId, String title, String author) {
        super(itemId); 
        this.title = title;
        this.author = author;
    }

    
    void displayBook() {
        System.out.println("Added book: \"" + title + "\" by " + author + ".");
    }
}

public class Task2 {
    public static void main(String[] args) {
     
        Book book1 = new Book("B001", "1984", "George Orwell");
        Book book2 = new Book("B002", "The Catcher in the Rye", "J.D. Salinger");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");
        
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        
        System.out.println("Total library items: " + LibraryItem.getTotalItemCount());
    }
}
