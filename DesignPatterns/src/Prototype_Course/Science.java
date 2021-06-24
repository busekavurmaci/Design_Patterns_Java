package Prototype_Course;

public class Science implements ICourse{

	public Science() {
		System.out.println("Science courses are created");
	}
	
	@Override
	public ICourse makeCopy() {
		System.out.println("Science courses have been created");
		Science scienceObj = null;
		
		try {
			scienceObj = (Science) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return scienceObj;
	}
	
	@Override
	public String toString() {
		return "Science {Machine learning courses is one of offering courses}";
	}
	

}
