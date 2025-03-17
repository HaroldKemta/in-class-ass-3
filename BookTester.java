// File: BookTester.java
// Author: Harold Kemta

public class BookTester {
    public static void main(String[] args) {
        
        // Testing default constructor
        Book book1 = new Book();
        System.out.println("Book 1 (Default Constructor): " + book1);
        
        // Testing parameterized constructor
        Book book2 = new Book("Java Programming", "John Doe", 500, 29.99);
        System.out.println("Book 2 (Parameterized Constructor): " + book2);
        
        // Testing mutators
        book2.setTitle("Advanced Java Programming");
        book2.setAuthor("Jane Smith");
        book2.setPages(700);
        book2.setPrice(39.99);
        System.out.println("Book 2 after modifications: " + book2);
        
        // Testing equals method
        Book book3 = new Book("Java Programming", "John Doe", 500, 29.99);
        System.out.println("Book 2 equals Book 3: " + book2.equals(book3));
        System.out.println("Book 1 equals Book 3: " + book1.equals(book3));
    }
}
