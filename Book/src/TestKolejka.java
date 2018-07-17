class Kolejka {
    private int tablica[];
    private int poczatek, koniec, rozmiarKolejki;



    public Kolejka (int rozmiar) {
        tablica = new int[rozmiar];
        poczatek = 0;
        koniec = 0;
        rozmiarKolejki = 0;
    }

    public void dodaj(int liczba){
        tablica [koniec % tablica.length] = liczba;
        koniec++;
        rozmiarKolejki++;
    }

    public int usun(){
        int temp = tablica [poczatek % tablica.length];
        poczatek++;
        rozmiarKolejki--;
        return temp;
    }

    public boolean czyPelna(){
        return (rozmiarKolejki == tablica.length);
    }

    public int zobacz(){
        return tablica[poczatek % tablica.length];
    }

    public int rozmiar() {
        return rozmiarKolejki;
    }

    public void wyswietl(){
        for (int i = poczatek % tablica.length; i < poczatek % tablica.length + rozmiarKolejki; i++)
            System.out.print( "Kolejka " + tablica[i % tablica.length]+ " ");
        System.out.println ();
    }
}

public class TestKolejka {
    public static void main(String args[]){
        Kolejka k = new Kolejka (20);

        k.dodaj (12);
        k.dodaj (8);
        k.dodaj (39);

        k.wyswietl ();

        System.out.println (k.zobacz ());

        k.usun ();

        k.wyswietl ();
    }

}
