// Parent class
class Animals {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Subclass
class Dog extends Animals {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animals myAnimal = new Animals(); // Object of parent class
        myAnimal.sound();

        Animals myDog = new Dog(); // Object of subclass
        myDog.sound();
    }
}
