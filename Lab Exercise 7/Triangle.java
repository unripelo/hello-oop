class Triangle {
    private int base;
    private int height;

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return 0.5 * base * height;
    }
}