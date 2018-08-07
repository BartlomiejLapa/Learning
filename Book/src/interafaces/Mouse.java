package interafaces;

public class Mouse implements Organism {
    double weight;

    Mouse(double weight) {
        this.weight = weight;
    }


    @Override
    public String eating() {
        return "Zjadam jedzenie";
    }

    @Override
    public Mouse duplicating() {
        Mouse miniMouse = new Mouse(5);
        return miniMouse;
    }

    @Override
    public void grownUp(double weightUp) {
        weight = weight * weightUp;

    }

    public void sound(){
        System.out.print("\n Pi Pi Pi \n");
    }
}
