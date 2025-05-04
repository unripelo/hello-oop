class Circle extends Calculate {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void area() {
        super.area();
        System.out.println(" a circle is: π * radius * radius");
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}