package interafaces;

public class Interfaces {
    public static void main(String args[]) {
        Organism mouse = new Mouse(51);
        Organism cat = new Cat();

        System.out.println("Mysz je : " + mouse.eating() +
                "\n Kot je: " + cat.eating());
        mouse.grownUp(10.69);
        cat.grownUp(12.1);




    }
}
