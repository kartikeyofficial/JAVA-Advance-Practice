package in.KartikeyCoding.Challenge49;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWritter {
    static void main(String[] args) {
        String fileName = "Kartikey.txt";
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the String in the File: ");
        String writ = x.nextLine();


        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(writ + System.lineSeparator());
            writer.flush();
            System.out.println("File is Successfully Write");
        }
        catch (IOException io){
            System.out.println("Exception is: "+io.getMessage());
        }
    }
}
