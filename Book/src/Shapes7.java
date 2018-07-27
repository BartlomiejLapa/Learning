class TwoDShapes{
    private double width;
    private double height;

    TwoDShapes() {
        width = height = 0.0;
    }

    TwoDShapes(double w, double h){
        width = w;
        height = h;
    }

    TwoDShapes (double x){
        width = height = x;
    }

    TwoDShapes(TwoDShapes ob ){
        width = ob.width;
        height = ob.height;
    }

    double getWidth(){

        return width;
    }
    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println ("Szer i wys: " + width + " i " +height);
    }

}

class Triangle2 extends TwoDShapes{
    private String style;

    Triangle2() {
        super ( );
        style = "nieokreslony";
    }

    Triangle2(String s, double w, double h){
        super(w, h);
        style = s;
    }

    Triangle2(double x){
        super(x);
        style = "wypelniony";
    }

    Triangle2(Triangle2 ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth ( ) * getHeight ( ) / 2;
    }

    void showStyle(){
        System.out.println ("Trojkat jest " + style);
    }
}



public class Shapes7 {
    public static void main(String args[]){
        Triangle2 t1 = new Triangle2 ("pusty", 9.9, 3.2);
        Triangle2 t2 = new Triangle2 (t1);

        System.out.println ("Informacje o t1 : ");
        t1.showDim ();
        t1.showStyle ();
        System.out.println ("Powierzchnia wynosi: " + t1.area ( ) + "\nInformacja o t2: ");
        t2.showStyle ();
        t2.showDim ();
        System.out.println ("Powierzchnia wynosi " +t2.area ());

    }
}
