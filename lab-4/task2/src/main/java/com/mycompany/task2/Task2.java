/*
 Create a class hierarchy for a library system. Start with a parent
class "LibraryItem" containing a final attribute "itemId" and static attribute
"totalItems" that keeps track of all items in the library. Create a child class
"Book" that inherits from LibraryItem and adds attributes for "title" and
"author". Implement a static method "getTotalItemCount()" in the
LibraryItem class that returns the current count. Create a program that
creates several books and displays the total item count.
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
