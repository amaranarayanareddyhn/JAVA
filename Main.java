class animals {
    void eat() {
        System.out.println("animals eat food");
    }

    void sleep() {
        System.out.println("animals sleep");
    }
}

class Dog extends animals {
    void bark() {
        System.out.println("dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
        d.sleep();
    }
}