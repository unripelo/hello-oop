class Triangle extends Calculate {
    private double base;
    private double height;

    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the area() method to calculate and display the triangle's area
    @Override
    public void area() {
        super.area(); // Call the base class's area() method
        System.out.println(" a triangle is: (base * height) / 2");
        double area = (base * height) / 2;
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}