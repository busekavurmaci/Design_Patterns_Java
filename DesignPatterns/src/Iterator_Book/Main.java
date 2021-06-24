package Iterator_Book;

public class Main {
    public static void main(String[] args) {
        BookOf2000 bookOf2000 = new BookOf2000();
        BookOf2010 bookOf2010 = new BookOf2010();
        BookOf2020 bookOf2020 = new BookOf2020();

        IEEEPublisher ieee = new IEEEPublisher(bookOf2000, bookOf2010, bookOf2020);
//        ieee.showOfBook();

        ieee.showOfBooks2();
    }
}
