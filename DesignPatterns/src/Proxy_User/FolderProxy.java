package Proxy_User;

public class FolderProxy implements IFolder{
    Folder folder;
    User user;

    public FolderProxy(User user) {
        this.user = user;
    }
    @Override
    public void performOperations() {
        if(user.getUserName().equalsIgnoreCase("arpit") &&
                user.getPassword().equalsIgnoreCase("arpit"))
        {
            folder=new Folder();
            folder.performOperations();
        }
        else
        {
            System.out.println("You don't have access to this folder");
        }
    }
    }

