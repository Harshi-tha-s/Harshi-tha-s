package week1;

public class Rectangle1 {
  
    private double length;
    private double width;

    public Rectangle1() {
        this.length = 0.1;
        this.width = 1.0;
    }

    public Rectangle1(double length, double width) {
        this.length = length;
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
    public static void main(String args[]) {
        Rectangle1 rectangle = new Rectangle1();
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
OUTPUT
Length: 0.1
Width: 1.0
Area: 0.1
Perimeter: 2.2

