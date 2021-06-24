package Mediator_Chat;

public class Main {

	public static void main(String[] args) {
		
		IChatRoom chatRoom = new ChatRoom();
		
		User user1 = new ChatUser(chatRoom, "1", "Buse");
		User user2 = new ChatUser(chatRoom, "2", "Sude");
		User user3 = new ChatUser(chatRoom, "3", "Esra");
		User user4 = new ChatUser(chatRoom, "4", "Asya");
		
		chatRoom.addUser(user1);
		chatRoom.addUser(user2);
		chatRoom.addUser(user3);
		chatRoom.addUser(user4);
		
		user1.send("Hello Sude","2");
		System.out.println("------------------------------------");
		user2.send("Hello Esra","3");
		System.out.println("------------------------------------");
		user3.send("Hello Asya","4");
		System.out.println("------------------------------------");
		user4.send("Hello Buse","1");
		System.out.println("------------------------------------");
	}

}
