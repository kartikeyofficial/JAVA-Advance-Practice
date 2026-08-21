package Revision.ClassAndObject;

public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }
    Book(String isbn){
        this(isbn, "Unknown","Unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is Already Borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }

    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you Enjoyed, Please Leave the review");
        }
        else {
            System.out.println("This Book already in the Library");
        }
    }

    static void main(String[] args) {
        Book designOfThing = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThing.borrowBook();
        myBook.borrowBook();
        designOfThing.borrowBook();
        designOfThing.returnBook();
        designOfThing.borrowBook();

    }
   

}
