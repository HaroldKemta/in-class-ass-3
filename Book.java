// File: Book.java
// Author: Harold kemta

public class Book {
    
    // Instance variables
    private String title;
    private String author;
    private int pages;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.pages = 100;
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, int pages, double price) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setPrice(price);
    }

    // Accessor methods (getters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    // Mutator methods (setters)
    public void setTitle(String title) {
        if (title != null && title.length() >= 3) {
            this.title = title;
        } else {
            this.title = "Unknown";
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            this.author = "Anonymous";
        }
    }

    public void setPages(int pages) {
        if (pages >= 1 && pages <= 10000) {
            this.pages = pages;
        } else {
            this.pages = 100;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    // toString method to return a string representation of the Book object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Price: " + price;
    }

    // equals method to compare two Book objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
}
