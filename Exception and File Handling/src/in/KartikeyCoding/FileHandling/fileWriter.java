package in.KartikeyCoding.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    static void main(String[] args) {
        String filename = "JavaCourse.txt";

        try(FileWriter writer = new FileWriter(filename)){
            writer.write("This is the Best Java Course\n");
            for (int i=0;i<=1000;i++){
                writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException io){
            System.out.println("Exception Occurred"+io.getMessage());

        }
    }
}
