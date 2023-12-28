package TY_JAVA;

public class areaOfShapes {

	public static void main(String[] args) {
		 System.out.println(circle(5));
		 System.out.println(rectangle(15, 10));
	}
	public static double circle(double radius) {
		return (3.14*radius*radius);
	}
	public static int rectangle(int length, int breadth) {
		return (length*breadth);
	}
	
}
