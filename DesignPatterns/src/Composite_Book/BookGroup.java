package Composite_Book;

import java.util.ArrayList;

import java.util.Iterator;

public class BookGroup extends BookComponent{

	ArrayList bookComponent = new ArrayList();
	String groupName;
	String groupDescription;
	
	public BookGroup(String newGroupName, String newGroupDescription) {
		this.groupName = newGroupName;
		this.groupDescription = newGroupDescription;
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public String getGroupDescription() {
		return groupDescription;
	}
	
	public void add(BookComponent newBookComponent) {
		bookComponent.add(newBookComponent);
	}
	
	public void remove(BookComponent newBookComponent) {
		bookComponent.remove(newBookComponent);
	}
	
	public BookComponent getComponent(int componentIndex) {
		return (BookComponent) bookComponent.get(componentIndex);
	}
	
	public void displayBookInfo() {
		System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
		Iterator bookIterator = bookComponent.iterator();
		
		while (bookIterator.hasNext()) {
			BookComponent bookInfo = (BookComponent) bookIterator.next();
			bookInfo.displayBookInfo();
		}
	}
	
}
