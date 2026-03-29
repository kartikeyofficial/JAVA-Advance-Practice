package in.KartikeyCoding.Challenge49;

import java.io.FileWriter;
import java.io.IOException;

public class TestWritter {
    static void main(String[] args) {
        String fileName = "Kartikey.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Kartikey is a GoodBoy.");
            writer.flush();
            System.out.println("File is Successfully Write");
        }
        catch (IOException io){
            System.out.println("Exception is: "+io.getMessage());
        }
    }
}
