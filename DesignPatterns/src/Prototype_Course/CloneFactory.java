package Prototype_Course;

public class CloneFactory {

	public ICourse getClone(ICourse courseSample) {
		return courseSample.makeCopy();
	}
}
