import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        circle.area(); 

        System.out.println(); 

        System.out.print("Enter the side of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        square.area();

        System.out.println();

        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);
        triangle.area(); 

        scanner.close(); 
    }
}