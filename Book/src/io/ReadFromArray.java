package io;

import java.io.IOException;

class Reading  {
    byte data[];

    Reading(int size) {
        data = new byte[size];
    }

    void setData() throws IOException {
        System.out.println("Wprowadz znaki");
        System.in.read(data);
    }

    void showData(){
        System.out.println("Wprowadziles: \n");
        for (int i=0;i<data.length;i++) {
            System.out.print((char)data[i]);
        }
    }


}
public class ReadFromArray {
    public static void main(String args[]) throws IOException {
        Reading data = new Reading(101);

        data.setData();

        data.showData();
    }
}
