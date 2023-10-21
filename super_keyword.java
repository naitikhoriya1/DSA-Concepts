public class super_keyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
    }
}

class Animal {
    public Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    public Horse() {
        System.out.println("Horse constructor called");
    }
}
