package Iterator_Book;

import java.util.Hashtable;
import java.util.Iterator;
public class BookOf2020 implements BookIterator{

    Hashtable<Integer, BookInfo>  bestPublication = new Hashtable<Integer, BookInfo>();
    int hashkey = 0;

    public BookOf2020() {

        addBook("Design Pattern Overview, third edition", "John Michael", 2021);
        addBook("Introduction to Machine Learning, third edition", "Mohammed", 2020);
        addBook("Network security and Cryptography, third edition", "William Stelling", 2020);
        addBook("Digital Image Processing, third edition", "Datu Abdarahman", 2021);

    }

    public void addBook(String bookName,String authorName, int yearPublished){
        BookInfo bookInfo = new BookInfo(bookName, authorName, yearPublished);
        bestPublication.put(hashkey, bookInfo);
        hashkey++;
    }

    public Hashtable<Integer, BookInfo> getBestPublication(){
        return bestPublication;
    }

    @Override
    public Iterator designBook() {
        return bestPublication.values().iterator();
    }
}
