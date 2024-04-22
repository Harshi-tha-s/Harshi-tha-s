package week1;

public class Rectangle {
 private double length;
	    private double width;

	    public Rectangle() {
	        // Default values for length and width
	        this.length = 0.0;
	        this.width = 0.0;
	    }

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setWidth(double width) {
	        this.width = width;
	    }

	    public double getLength() {
	        return length;
	    }
	    public double getWidth() {
	        return width;
	    }

	    public double calculateArea() {
	        return length * width;
	    }
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
   
	    public static void main(String[] args) {
	  
	        Rectangle rectangle = new Rectangle();

	        rectangle.setLength(5.0);
	        rectangle.setWidth(3.0);
	        double length = rectangle.getLength();
	        double width = rectangle.getWidth();
	        double area = rectangle.calculateArea();
	        double perimeter = rectangle.calculatePerimeter();

	        System.out.println("Length: " + length);
	        System.out.println("Width: " + width);

	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	    }
	}



