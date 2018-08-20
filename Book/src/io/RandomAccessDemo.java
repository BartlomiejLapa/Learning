package io;

import java.io.*;

public class RandomAccessDemo {
    public static void main(String args[]) {
        double data[] = {12.3, 44.4, 4.0, 23.1, 231.33, 33.6};
        double d;

        try (RandomAccessFile randomFile = new RandomAccessFile("Book\\src\\io\\random.txt", "rw")) {

            for(int i=0; i<data.length; i++) {
                randomFile.writeDouble(data[i]);
            }

            for (int i=0; i<data.length; i++) {

            randomFile.seek(i*8);
            d =randomFile.readDouble();
            System.out.print(d);
            if(i != data.length -1 ) System.out.print(" | ");
        }


    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



