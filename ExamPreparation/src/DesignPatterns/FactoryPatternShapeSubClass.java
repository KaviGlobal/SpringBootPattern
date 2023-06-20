package DesignPatterns;

public class FactoryPatternShapeSubClass {
	
	public static FactoryPatternShapeInt getShapeType(String shapeType) {
		FactoryPatternShapeInt s=null;
		if(shapeType.equalsIgnoreCase("Circle")) {
			s=new CircleClass();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle")) {
			s=new RectangleClass();
		}
		else if(shapeType.equalsIgnoreCase("Triangle")) {
			s=new TriangleClass();
		}
		return s;
	}
}
