package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class TakePath {
   private String pathFile;
   private BufferedReader fileReader = null;
   private String textRead;
   int counterLines = 0;

    void getPathFile() throws  IOException {

        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("Podaj sciezke pliku ");
            pathFile = reading.nextLine();
            reading.close();

            fileReader = new BufferedReader(new FileReader(pathFile));

            do {
                textRead = fileReader.readLine();
                System.out.println(textRead);
                counterLines++;
            } while (textRead != null);

        } catch (FileNotFoundException exc ) {
            System.out.println("BLAD: Brak pliku pod podana sciezka ");
        } catch (IOException exc) {
            System.out.println("BLAD: Wejscia/Wyjscia");
    } finally {
            if (fileReader != null) fileReader.close();


        }
        System.out.println("Ilosc przeczytanych linii: " + counterLines);
    }

}

public class TakePathReader {
    public static void main(String args[]) throws IOException {
        TakePath asd = new TakePath();

        asd.getPathFile();
    }
}
