package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class WriteFilePath {
     String pathFile;
     String message ="+48 660 035 563";
     BufferedWriter zapis = null;



    void zapis(String pathFile) throws IOException {
        try {

            zapis = new BufferedWriter(new FileWriter(pathFile,true));
            zapis.write(message);
            System.out.println("zapisano");
            zapis.newLine();
            zapis.flush();


        } finally {
            if (zapis != null) {
                zapis.close();
                            }
        }

    }


}

public class WriteFile {
    public static void main(String args[]) throws IOException {
        String path = "C:\\Users\\bluefusion\\IdeaProjects\\Learning\\Book\\src\\io\\file.txt";
        WriteFilePath zapis = new WriteFilePath();
        zapis.zapis(path);
    }
}
