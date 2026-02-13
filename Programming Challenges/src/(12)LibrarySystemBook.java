class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static int totalBooks;
    static {
        totalBooks = 0;
    }
    { // Object Init
        totalBooks++;
    }
   Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;


   }
   Book(String isbn){
        this(isbn,"Unknown","Unknown");
   }

   static int getTotalNoOfBooks(){
        return totalBooks;
   }
   void borrowBook(){
        if(isBorrowed) {
            System.out.println("Book is Already Borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title+" Book");
        }
   }
   void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You Enjoy the book!, Please a Review");
        }else{
            System.out.println("This Book is Already in Library");
        }
   }

    static void main(String[] args) {
        Book DesignOfThing = new Book("1","Design","K.Kartikey");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        DesignOfThing.borrowBook();
        myBook.borrowBook();
        DesignOfThing.borrowBook();
        myBook.returnBook();
    }

}
