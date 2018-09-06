package GenericsType;


class NAGen<N, A> {
    N name;
    A age;

    NAGen(N name, A age) {
        this.name = name;
        this.age = age;
    }

    N showName() {
        return  name;
    }

    A showAge() {
        return age;
    }



}
public class NamesAges {
    public static void main(String args[]) {
        NAGen<String, Integer> obj = new NAGen<>("Kamil", 55);
        NAGen<Double, String> obj2 = new NAGen<>(66.69, "zł");



        System.out.println("Imie: " + obj.showName() + " " + ",wiek: " + obj.showAge());
        System.out.println("Stan konta: " + obj2.showName() + obj2.showAge());


    }
}
