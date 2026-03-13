package in.KartikeyCoding.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Testwritter {
    static void main(String[] args) {
        String filename = "/home/kartikey/Downloads/DemoFile.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello Kartikey");
            for (int i=0;i<100;i++){
                writer.write("Hello Kartikey Baby\n");
            }
            writer.flush();
            System.out.println("File is Successfully write.");

        }catch (IOException io){
            System.out.println("File is Not Written: "+io.getMessage());
        }
    }
}
