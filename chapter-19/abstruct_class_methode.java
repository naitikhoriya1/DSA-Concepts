public class abstruct_class_methode {

    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
        hr.eat();
        System.out.println(hr.color);

        Chicken ch = new Chicken();
        ch.walk();
        ch.eat();
        System.out.println(ch.getColor());
    }
}

abstract class Animal {
    protected String color;

    public Animal() {
        color = "brown";
    }

    public void eat() {
        System.out.println("All animals can eat");
    }

    public abstract void walk();

    public String getColor() {
        return color;
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse can walk on four legs");
    }

    public void changeColor(String newColor) {
        // A method to change the color of the horse
        super.color = newColor;
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken can walk on two legs");
    }

    public void changeColor(String newColor) {
        // A method to change the color of the chicken
        super.color = newColor;
    }
}
