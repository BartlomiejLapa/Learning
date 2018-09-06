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


        String n = obj.showName();
        int a = obj.showAge();

        System.out.println("Imie: " + n + " " + "wiek: " + a);


    }
}
