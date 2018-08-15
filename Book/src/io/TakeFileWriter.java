package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class TakeWriter {
    private String file;
    private String path = "C:\\Users\\bluefusion\\IdeaProjects\\Learning\\Book\\src\\io\\";
    String message;
    String pathFile = "C:\\Users\\bluefusion\\IdeaProjects\\Learning\\Book\\src\\io\\file3.txt";
    BufferedWriter saving = null;



/*    void setPathFile() throws IOException {
        System.out.println("Podaj nazwe i rozszerzenei pliku");
        Scanner reading = new Scanner(System.in);
        file = reading.nextLine();
        pathFile = new StringBuilder(path).append(file).toString();
        System.out.println(pathFile);
        try {
            BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile));

        } finally {
            if (saving != null) {
                saving.close();
            }
        }
    }*/

    void getMessage() throws IOException {

        try {
            Scanner reading = new Scanner(System.in);
            BufferedWriter saving = new BufferedWriter(new FileWriter(pathFile, true));
        do {
            System.out.println("Podaj wiadomosc do zapisania, w celu zatrzymania wcisnij \"-\" ");
            message = reading.nextLine();
            saving.write(message);
            saving.newLine();
            saving.close();

        } while (!message.equals("-"));


        } finally {
            if (saving != null) {
                saving.close();


            }
        }
    }
}



public class TakeFileWriter {
    public static void main(String args[]) throws IOException {
        String pathFile;

        TakeWriter start = new TakeWriter();

//        start.setPathFile();
        start.getMessage();


    }
}

