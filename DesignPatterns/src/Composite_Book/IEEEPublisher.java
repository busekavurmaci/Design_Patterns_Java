package Composite_Book;

public class IEEEPublisher {
BookComponent bookList;

public IEEEPublisher(BookComponent newBookList) {
	this.bookList = newBookList;
}

public void getBookList() {
	bookList.displayBookInfo();
}

}
