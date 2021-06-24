package Mediator_Book;

public class Mediator {

	ButtonBook buttonBook;
	ButtonSearch buttonSearch;
	ButtonView buttonView;
	LabelDisplay labelDisplay;
	

	public void registerView(ButtonView buttonView) {
		this.buttonView = buttonView;
	}
	
	public void registerBook(ButtonBook buttonBook) {
		this.buttonBook = buttonBook;
	}
	
	public void registerSearch(ButtonSearch buttonSearch) {
		this.buttonSearch = buttonSearch;
	}
	
	public void registerDisplay(LabelDisplay labelDisplay) {
		this.labelDisplay = labelDisplay;
	}
	
	public void view() {
		buttonView.setEnabled(false);
		buttonBook.setEnabled(true);
		buttonSearch.setEnabled(true);
		labelDisplay.setText("Viewing . . . ");
	}
	
	public void search() {
		buttonView.setEnabled(true);
		buttonBook.setEnabled(true);
		buttonSearch.setEnabled(false);
		labelDisplay.setText("Searching . . . ");
	}
	
	public void book() {
		buttonView.setEnabled(true);
		buttonBook.setEnabled(false);
		buttonSearch.setEnabled(true);
		labelDisplay.setText("Booking . . . ");
	}
	
}
