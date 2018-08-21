package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Copy2 {
    String pathFile1, pathFile2;

    Copy2(String pathFile1, String pathFile2) {
        this.pathFile1 = pathFile1;
        this.pathFile2 = pathFile2;
    }

    void copying() throws FileNotFoundException {
        int temp;
        FileInputStream fileInputStream = new FileInputStream(pathFile1);
        FileOutputStream fileOutputStream = new FileOutputStream(pathFile2);
        try {


            do {
                temp = fileInputStream.read();
                System.out.println(temp + " ");
                if((char)temp == ' ') temp = '-';
                fileOutputStream.write(temp);
            } while (fileInputStream.read() != -1);

        } catch (IOException exc) {
            System.out.println("Błąd pliku");
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
public class CopyFile2 {
    public static void main(String args[]) throws FileNotFoundException {
        String path1 = "Book\\src\\io\\copy1.txt";
        String path2 = "Book\\src\\io\\copy2.txt";
        Copy2 copy = new Copy2(path1, path2);
        copy.copying();
    }
}
