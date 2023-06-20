package DesignPatterns;

/**
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class 
 * for creating an object 
 * but let the subclasses decide which class to instantiate
 * @author sarav
 *
 */
public class FactoryPatternMainClass {

	public static void main(String args[]) {
		String type="triangle";
		FactoryPatternShapeInt fInt=FactoryPatternShapeSubClass.getShapeType(type);
		fInt.draw();
	}
}
