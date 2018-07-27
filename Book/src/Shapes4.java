import java.util.concurrent.TransferQueue;

class TwoDShape{
    private double width, height;

    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println ("Szerokosc i wysokosc : " + width + "i " + height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h){
/*        setWidth (w);
        setHeight (h);*/
super(w,h);
        style = s;
    }

    double area(){
        return getWidth () * getHeight () / 2;
    }

    void showStyle(){
        System.out.println ("Twojkat jest " + style);
    }
}

public class Shapes4 {
    public static void main(String args[]){
        Triangle t1 = new Triangle ("Wypełniony", 5.6, 5.2);
        Triangle t2 = new Triangle ("pusty", 8.0, 2.2);

        System.out.println ("Informacje o t1: ");
        t1.showStyle ();
        t1.showDim ();
        System.out.println ("Powierzchnia wynosi: " + t1.area ());

        System.out.println ();

        System.out.println ("Informacje o t2: ");
        t2.showStyle ();
        t2.showDim ();
        System.out.println ("Powierzchnia wynosi: " + t2.area ());
    }
}
