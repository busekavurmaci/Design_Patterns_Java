package Iterator_Names;

public class Main {
    public static void main(String[] args) {
        RepositoryName repositoryname = new RepositoryName();

        for(Iterator iterator = repositoryname.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
