package Iterator_Book;

import java.util.ArrayList;
import java.util.Iterator;
public class BookOf2000 implements BookIterator {
    ArrayList<BookInfo> bestPublication;

    public BookOf2000() {
        bestPublication = new ArrayList<BookInfo>();
        addBook("Design Pattern Overview", "John Michael", 2001);
        addBook("Introduction to Machine Learning", "Mohammed", 2009);
        addBook("Network security and Cryptography", "William Stelling", 2008);
        addBook("Digital Image Processing", "Datu Abdarahman", 2005);

    }

    public void addBook(String bookName,String authorName, int yearPublished){
        BookInfo bookInfo = new BookInfo(bookName, authorName, yearPublished);
        bestPublication.add(bookInfo);
    }

    public ArrayList<BookInfo> getBestPublication(){
        return bestPublication;
    }

    @Override
    public Iterator designBook() {

        return bestPublication.iterator();
    }
}
