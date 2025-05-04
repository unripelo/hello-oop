class Square extends Calculate {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void area() {
        super.area(); 
        System.out.println(" a square is: side * side");
        double area = side * side;
        System.out.println("The area of the square with side " + side + " is: " + area);
    }
}