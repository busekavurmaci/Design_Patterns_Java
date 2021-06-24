package Iterator_Book;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class IEEEPublisher {
    BookOf2000 bookOf2000;
    BookOf2010 bookOf2010;
    BookOf2020 bookOf2020;

    BookIterator iterator2000;
    BookIterator iterator2010;
    BookIterator iterator2020;

//    public IEEEPublisher(BookOf2000 newbookOf2000, BookOf2010 newbookOf2010, BookOf2020 newbookOf2020) {
//        this.bookOf2000 = newbookOf2000;
//        this.bookOf2010 = newbookOf2010;
//        this.bookOf2020 = newbookOf2020;
//    }
        public IEEEPublisher(BookIterator newbookOf2000, BookIterator newbookOf2010, BookIterator newbookOf2020) {
            this.iterator2000 = newbookOf2000;
            this.iterator2010 = newbookOf2010;
            this.iterator2020 = newbookOf2020;
}
    public void showOfBook(){

        ArrayList aL2000sBooks = bookOf2000.getBestPublication();
        System.out.println("Books of the 2000 published\n");
        for(int i=0; i < aL2000sBooks.size(); i++){
            BookInfo bestPublications = (BookInfo) aL2000sBooks.get(i);
            System.out.println(bestPublications.getBookName());
            System.out.println(bestPublications.getAuthorName());
            System.out.println(bestPublications.getYearPublished());

        }
        BookInfo[] array2010sBooks = bookOf2010.getBestPublication();
        System.out.println("Books of the 2010 published\n");
        for(int i=0; i < array2010sBooks.length; i++){

            BookInfo bestPublications = array2010sBooks[i];
            System.out.println(bestPublications.getBookName());
            System.out.println(bestPublications.getAuthorName());
            System.out.println(bestPublications.getYearPublished());

        }
        Hashtable<Integer, BookInfo> ht2020sBooks = bookOf2020.getBestPublication();
        System.out.println("Books of the 2020 published\n");
        for(Enumeration<Integer> e=ht2020sBooks.keys(); e.hasMoreElements();){
            BookInfo bestPublications = (BookInfo) ht2020sBooks.get(e.nextElement());
            System.out.println(bestPublications.getBookName());
            System.out.println(bestPublications.getAuthorName());
            System.out.println(bestPublications.getYearPublished());

        }
    }

    public void showOfBooks2(){
            Iterator books2000 = iterator2000.designBook();
            Iterator books2010 = iterator2010.designBook();
            Iterator book2020 = iterator2020.designBook();

        System.out.println("Book of the 2000\n");
        booksPublished(books2000);
    }

    public void booksPublished(Iterator iterator){
            while(iterator.hasNext()){
                BookInfo bookInfo = (BookInfo) iterator.next();
                System.out.println(bookInfo.getBookName());
                System.out.println(bookInfo.getAuthorName());
                System.out.println(bookInfo.getYearPublished());
            }

    }

}
