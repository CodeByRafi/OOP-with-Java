class Book 
{  
    private String title;
    private int year;
    private String author;

    public Book(String title, int year, String author) 
    {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void displayInfo() 
    {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
        System.out.println("---------------------");
    }
}

public class task_8
{
    public static void main(String[] args) 
    {
        Book book1 = new Book("The Catcher in the Rye", 1951, "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", 1960, "Harper Lee");
        Book book3 = new Book("1984", 1949, "George Orwell");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
