package interafaces;

public class Cat implements Organism {
    double catWeight;

    @Override
    public String eating() {
        return " karmienie... ";
    }

    @Override
    public Cat duplicating() {
        Cat smallCat = new Cat();
        smallCat.catWeight = 10;
        return smallCat;
    }

    @Override
    public void grownUp(double weightUp) {
        System.out.println("Wzrost masy o " + weightUp);
        catWeight += weightUp;

    }
}
