package basicintemediate;

public class constructor {

	public static void main(String[] args) {
		class Rectangle {
		    int length;
		    int breadth;

		    // Default constructor
		    Rectangle() {
		        length = 1;
		        breadth = 1;
		    }

		    // Parameterized constructor
		    Rectangle(int l, int b) {
		        length = l;
		        breadth = b;
		    }

		    // Method to calculate area
		    int area() {
		        return length * breadth;
		    }
		}

		public class ConstructorOverloadingDemo {
		    public static void main(String[] args) {
		        // Object with default constructor
		        Rectangle rect1 = new Rectangle();
		        System.out.println("Area (default): " + rect1.area());

		        // Object with parameterized constructor
		        Rectangle rect2 = new Rectangle(5, 10);
		        System.out.println("Area (5,10): " + rect2.area());
		    }
		}
