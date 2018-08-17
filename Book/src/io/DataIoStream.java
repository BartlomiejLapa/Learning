package io;

import java.io.*;

class DataIo{
       int i = 11;
        double d = 33.33;
        boolean b = false;
        private String pathFile="Book\\src\\io\\file3.txt";

        void setData() {
        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(pathFile))) {
            System.out.println("Zapisywanie liczby: " + i);
            dataOutput.writeInt(i);

            System.out.println("Zapisywanie liczby:" + d);
            dataOutput.writeDouble(d);

            System.out.println("Zapisywanie:" + b);
            dataOutput.writeBoolean(b);

            System.out.println("Zapisywanie:" + 66.66 * 6.9);
            dataOutput.writeDouble(66.66 * 6.9);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd zapisu");
            return;
        }

    }

    void getData(){

       try (DataInputStream dataInput = new DataInputStream(new FileInputStream(pathFile))) {
            i = dataInput.readInt();
            System.out.println("Odczytywanie: " + i);

            d = dataInput.readDouble();
            System.out.println("Odczytywanie: " + d);

            b = dataInput.readBoolean();
            System.out.println("Odczytywanie: " + b);

           d = dataInput.readDouble();
           System.out.println("Odczytywanie: " + d);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd odczytu.");
        }
    }
}

public class DataIoStream {
    public static void main(String args[]) {
        DataIo data = new DataIo();

        data.setData();
        data.getData();

    }
}