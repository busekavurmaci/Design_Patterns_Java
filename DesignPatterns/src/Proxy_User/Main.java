package Proxy_User;

public class Main {
    public static void main(String[] args) {
    	
        User user=new User("arpit","arpit");
        
        FolderProxy folderProxy=new FolderProxy(user);
        System.out.println("When userName and password are correct:");
        folderProxy.performOperations();
        System.out.println("**************************************");
        
        // if we give wrong userName and Password
        User userWrong=new User("abc","abc");
        FolderProxy folderProxyWrong=new FolderProxy(userWrong);
        System.out.println("When userName and password are incorrect:");
        folderProxyWrong.performOperations();
    }
}
