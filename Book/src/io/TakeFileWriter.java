package io;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class TakeWriter {
    private String pathFile;
    private String message;

    BufferedWriter saving = null;



    void setPathFile() throws IOException {
        System.out.println("Podaj sciezke do pliku tekstowego");
        Scanner reading = new Scanner(System.in);
        pathFile = reading.nextLine();
        try {
            BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile));

        } finally {
            if (saving != null) {
                saving.close();
            }
        }
    }

    void getMessage() throws IOException {
        System.out.println("Podaj wiadomosc do zapisania, w celu zatrzymania wcisnij \"-\" ");
        Scanner reading = new Scanner(System.in);
        do {
            message = reading.nextLine() + System.lineSeparator();

            try {
                BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile));
                saving.write(message);
            } finally {
                if (saving != null) {
                    saving.close();
                    saving.flush();
                }
            }

        } while (reading.nextLine() != "-");
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

