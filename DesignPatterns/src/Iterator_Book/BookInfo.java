package Iterator_Book;

public class BookInfo {
    String bookName;
    String authorName;
    int yearPublished;
    public BookInfo(String newBookName, String newAuthorName, int yearPublished){
        bookName = newBookName;
        authorName = newAuthorName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
