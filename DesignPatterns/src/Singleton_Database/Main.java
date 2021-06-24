package Singleton_Database;

class DataBase{
	
	private static DataBase dbObj;
	
	private DataBase() {
		
	}
	
	public static DataBase getInstance() {
		if(dbObj == null) {
			dbObj = new DataBase();
		}
		return dbObj;
	}
	
	public void getConnection() {
		System.out.println("Database is connected and now is available for customer.");
	}
	
}
//--------------------- MAIN ---------------------------
public class Main {

	public static void main(String[] args) {
		
		DataBase db1;
		db1 = DataBase.getInstance();
		db1.getConnection();

	}

}
