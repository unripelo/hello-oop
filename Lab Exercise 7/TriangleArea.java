import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Please enter the base: ");
        double baseInput = input.nextDouble();
        triangle.setBase(baseInput);

        System.out.print("Please enter the height: ");
        double heightInput = input.nextDouble();
        triangle.setHeight(heightInput);

        double area = triangle.calculateArea();

        System.out.println("The area of a triangle is : " + (int)area);

        input.close();
    }
}