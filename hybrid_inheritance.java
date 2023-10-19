public class hybrid_inheritance {

    public static void main(String[] args) {
        // creating object of child class and calling the method
        fish ff = new fish();
        ff.eat();
        ff.swim();

        cat cc = new cat();
        cc.meo();
        cc.hunt();
    }
}

class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class fish extends Animal {
    String type;
    int age;

    void swim() {
        System.out.println("Fish is swimming");
    }
}

class tuna extends fish {
    void color() {
        System.out.println("Tuna has blue color");
    }
}

class shark extends fish {
    void color() {
        System.out.println("shark has green color");
    }
}

class bird extends Animal {
    String type;
    int age;

    void fly() {
        System.out.println("Bird is flying");
    }
}

class peacock extends bird {
    void color() {
        System.out.println("Peacock has purple color");
    }
}

class mammals {
    String type;
    int age;

    void walk() {
        System.out.println("Mammal is walking");
    }
}

class dog extends mammals {
    void barks() {
        System.out.println("Dog barks");
    }
}

class cat extends mammals {
    void meo() {
        System.out.println("Cat says Meow");
    }
    void hunt(){
        System.out.println("cat hunting");
    }
}

class human extends mammals {
    void speak(String language) {
        System.out.println("We can say simple hindi , english languages");
    }
}