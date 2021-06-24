package Mediator_Chat;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom{

	private Map<String, User> userMap = new HashMap<>();
	
	@Override
	public void sendMessage(String msg, String userId) {
		// TODO Auto-generated method stub
		User u = userMap.get(userId);
		u.receive(msg);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userMap.put(user.getId(), user);
	}

}
