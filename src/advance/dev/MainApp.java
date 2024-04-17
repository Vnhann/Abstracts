package advance.dev;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        input(shapes);
        print(shapes);
        System.out.println("Shape with largest area: ");
        Shape largestShape = findLargestArea(shapes);
        System.out.println(largestShape.getClass().getSimpleName() + ": Area = " + largestShape.dienTich());

        System.out.println("Largest area for each shape type: ");
        findLargestAreaForEachType(shapes);
    }

    // Method to input values for shapes array
    public static void input(Shape[] shapes) {
        // Input values for circles
        for (int i = 0; i < 3; i++) {
            double radius = 5; // Example radius
            shapes[i] = new Circle(radius);
        }

        // Input values for rectangles
        for (int i = 3; i < 6; i++) {
            double length = 4; // Example length
            double width = 3; // Example width
            shapes[i] = new Rectangle(length, width);
        }

        // Input values for triangles
        for (int i = 6; i < 10; i++) {
            double a = 3, b = 4, c = 5; // Example sides
            shapes[i] = new Triangle(a, b, c);
        }
    }

    // Method to print shapes
    public static void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": Chu vi = " + shape.chuVi() + ", Dien tich = " + shape.dienTich());
        }
    }

    // Method to find shape with largest area
    public static Shape findLargestArea(Shape[] shapes) {
        Shape largestShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].dienTich() > largestShape.dienTich()) {
                largestShape = shapes[i];
            }
        }
        return largestShape;
    }

    // Method to find largest area for each shape type
    public static void findLargestAreaForEachType(Shape[] shapes) {
        double maxCircleArea = 0;
        double maxRectangleArea = 0;
        double maxTriangleArea = 0;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                double area = shape.dienTich();
                if (area > maxCircleArea) {
                    maxCircleArea = area;
                }
            } else if (shape instanceof Rectangle) {
                double area = shape.dienTich();
                if (area > maxRectangleArea) {
                    maxRectangleArea = area;
                }
            } else if (shape instanceof Triangle) {
                double area = shape.dienTich();
                if (area > maxTriangleArea) {
                    maxTriangleArea = area;
                }
            }
        }

        System.out.println("Circle: " + maxCircleArea);
        System.out.println("Rectangle: " + maxRectangleArea);
        System.out.println("Triangle: " + maxTriangleArea);
    }
}