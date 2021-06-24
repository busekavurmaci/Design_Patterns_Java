package Composite_Book;

public abstract class BookComponent {

	public void add(BookComponent newBookComponent) {
		throw new UnsupportedOperationException();
	}
	
    public void remove(BookComponent newBookComponent) {
	    throw new UnsupportedOperationException();
	}
    
    public BookComponent getComponent (int componentIndex) {
    	throw new UnsupportedOperationException();
    }
    
    public String getBookName () {
    	throw new UnsupportedOperationException();
    }
    
    public String getBookPublicationYear () {
    	throw new UnsupportedOperationException();
    }
    
    public void displayBookInfo () {
    	throw new UnsupportedOperationException();
    }
    
}
