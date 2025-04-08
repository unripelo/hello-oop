class Animal {

    public void eat () {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {

    @Override 
    public void eat() {
        System.out.println("I can eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }
}

class Main 