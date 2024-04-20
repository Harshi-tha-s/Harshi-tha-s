package week1;

public class Circle1 {
	 public static void main(String[] args) {
	        Circle circle = new Circle(5);
	        System.out.println("Radius of the circle: " + circle.getRadius());
	        circle.setRadius(7);
	        System.out.println("Modified radius of the circle: " + circle.getRadius());
	        System.out.println("Area of the circle after modification: " + circle.calculateArea());
	        System.out.println("Circumference of the circle after modification: " + circle.calculateCircumference());
	    }
}
OUTPUT
Radius of the circle: 5.0
Modified radius of the circle: 7.0
Area of the circle after modification: 153.93804002589985
Circumference of the circle after modification: 43.982297150257104
