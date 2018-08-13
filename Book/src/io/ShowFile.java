package io;

import java.io.*;

public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream stream;

        if (args.length != 1) {
            System.out.println("ShowFile NazwaPliku");
            return;
        }

        try {
            stream = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("Brak pliku");
            return;
        }

        try {
            do {
                i = stream.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Blad podczas odczytu pliku");
        }

        try {
            stream.close();
        } catch (IOException exc) {
            System.out.println("Blad podczas zamykania pliku");
        }
    }
}
