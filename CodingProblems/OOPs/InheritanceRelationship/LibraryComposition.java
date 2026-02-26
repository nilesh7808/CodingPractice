package CodingProblems.OOPs.InheritanceRelationship;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String title;
    public String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Library{
    private final List<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }
    public void addBook(String title, String author){
        books.add(new Book(title,author));
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class LibraryComposition {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("ABC", "Nilesh");
        library.addBook("DEF","Ankit");
        library.addBook("GHI","Rajat");
        library.addBook("JKL","Niraj");
        library.addBook("MNO","Kishan");
        library.addBook("PQR","Shantanu");
        library.addBook("STU","Akash");
        library.addBook("VWX","Sangwan");
        library.addBook("YZ","Areeb");
        for(Book book : library.getBooks()){
            System.out.println("Title is: " + book.title + " and their author is: " + book.author);
        }
    }
}
