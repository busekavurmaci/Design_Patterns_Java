package Prototype_Course;

public class Main {

	public static void main(String[] args) {
		CloneFactory courseCreator = new CloneFactory();
		Science scienceCourse = new Science();
		Science clonedScienceCourse = (Science) courseCreator.getClone(scienceCourse);
		
		System.out.println(scienceCourse);
		System.out.println(clonedScienceCourse);
		
		System.out.println("Science Course Hascode: " + System.identityHashCode(System.identityHashCode(scienceCourse)));
		System.out.println("Clone Course Hascode: " + System.identityHashCode(System.identityHashCode(clonedScienceCourse)));

	}

}
