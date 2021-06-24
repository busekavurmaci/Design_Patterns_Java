package Iterator_Book;

import java.util.Arrays;
import java.util.Iterator;
public class BookOf2010 implements BookIterator{

    BookInfo[] bestPublication;
    int arrayValue = 0;

    public BookOf2010() {
        bestPublication = new BookInfo[4];
        addBook("Design Pattern Overview, second edition", "John Michael", 2011);
        addBook("Introduction to Machine Learning, second edition", "Mohammed", 2019);
        addBook("Network security and Cryptography, second edition", "William Stelling", 2018);
        addBook("Digital Image Processing, second edition", "Datu Abdarahman", 2015);

    }

    public void addBook(String bookName,String authorName, int yearPublished){
        BookInfo bookInfo = new BookInfo(bookName, authorName, yearPublished);
        bestPublication[arrayValue] = bookInfo;
        arrayValue++;
    }

    public BookInfo[] getBestPublication(){
        return bestPublication;
    }

    @Override
    public Iterator designBook() {
        return Arrays.asList(bestPublication).iterator();
    }
}
