import com.sun.org.apache.regexp.internal.RE;

import java.util.concurrent.RecursiveTask;

class TwoDShape2{
    private double width;
    private double height;
    private String name;

    TwoDShape2(){
        width = height = 0.0;
        name = "none";
    }


    TwoDShape2(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }

    TwoDShape2(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape2(TwoDShape2 ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth(){
        return width;}
    double getHeight(){
        return height;}
    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }

    String getName(){
        return name;
    }

    void showDim() {
        System.out.println ("Szer i wys " + width + " i " + height);
    }

    double area(){
        System.out.println ("area() musi byc przeslonieta w klasach pochodnych");
        return 0.0;
    }

}

class Triangle3 extends TwoDShape2{
    private String style;

    Triangle3(){
        super();
        style = "nieokreslony";
    }

    Triangle3(String s, double w, double h) {
        super (w, h, "Twojkat");
        style = s;
    }

    Triangle3(double x){
        super (x, "trojkat");
        style = "wypelniony";
    }

    Triangle3 (Triangle3 ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth () * getHeight () /2 ;

    }

    void showStyle(){
        System.out.println ("Trójkąt jest " + style);
    }
}

class Rectagle extends TwoDShape2{
    private String style;

    Rectagle(){
        super ( );
    }

    Rectagle(double w, double h) {
        super (w, h, "prostokat");
    }

    Rectagle(double x){
        super (x, "prostokat");
    }

    Rectagle(Rectagle ob){
        super(ob);
    }

    boolean isSquare(){
        if(getWidth () == getHeight () ) return true;
        return false;
    }

    double area() {
        return getWidth ( ) * getHeight ( );
    }

}

public class DynShapes {
    public static void main(String args[]) {
        TwoDShape2 shapes[] = new TwoDShape2[5];

        shapes[0] = new Triangle3 ("pusty", 8.2, 4.4);
        shapes[1] = new Rectagle (10);
        shapes[2] = new Rectagle (10, 5);
        shapes[3] = new Triangle3 (7.7);
        shapes[4] = new TwoDShape2 (11, 22, "ogolny");

        for (int i=0; i<shapes.length; i++){
            System.out.println ("Typ obiektu: " + shapes[i].getName ());
            System.out.println ("Powierzchnia wynosi: " + shapes[i].area ());
        }
    }
}
