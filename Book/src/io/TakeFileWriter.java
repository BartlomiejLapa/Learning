package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.net.URI;
import java.io.File;

class TakeWriter  {
    private String file;
    private String path = new String("Book\\src\\io\\");
    private String message;
    private String pathFile;
    BufferedWriter saving = null;






    void setPathFile() throws IOException {
        System.out.println("Podaj nazwe i rozszerzenei pliku");
        Scanner reading = new Scanner(System.in);
        file = reading.nextLine();
        pathFile = new StringBuilder(path).append(file).toString();

          try {
            BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile));
            File urlPathFile = new File(pathFile);
            System.out.print("Sciezka do pliku: " + urlPathFile.getAbsolutePath());
            System.out.println("\n");

        } finally {
            if (saving != null) {
                saving.close();
            }
        }

    }

    void getMessage() throws IOException {

        try {
            Scanner reading = new Scanner(System.in);
            System.out.print("#### Aby wyczyscic plik wpisz \"null\" ####\n");
            BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile, true));
        do {
            System.out.println("Podaj wiadomosc do zapisania, w celu zatrzymania zostaw puste pole i wcisnij enter.");
            message = reading.nextLine();
            saving.write(message);
            saving.newLine();
            if (message.equals("null")) clearFile();


        } while (!message.equals(""));
            saving.close();
            reading.close();

        } finally {
            if (saving != null) {
                saving.close();
                saving.flush();
            }
        }
    }

    void clearFile() throws IOException {
        FileWriter clear = new FileWriter(pathFile);
        clear.write(toString());
    }
}



public class TakeFileWriter {
    public static void main(String args[]) throws IOException {
        String pathFile;

        TakeWriter start = new TakeWriter();

        start.setPathFile();
        start.getMessage();

    }
}

