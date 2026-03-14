package in.KartikeyCoding.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritenewFile {
    static void main(String[] args) {
        String fileName = "/home/kartikey/Documents/Git Chit Sheet.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Kartikey is Good Boy");
            writer.flush();
            System.out.println("File Write Successfully!");

        }
        catch (IOException io){
            System.out.println("Exception Occurred: "+io.getMessage());
        }
    }
}
