final class collage {

    final int fees = 500000;

    final void display() {
        System.out.println("fees " + fees);
    }
}

public class student{

    public static void main(String[] args) {

        collage c = new collage();
        c.display();

    }
}