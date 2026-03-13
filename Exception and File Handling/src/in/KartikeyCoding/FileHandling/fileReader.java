package in.KartikeyCoding.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    static void main(String[] args) {
        String filename = "JavaCourse.txt";

        try(FileReader reader = new FileReader(filename)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while (read != -1);
        }
        catch (IOException io){
            System.out.println("Exception Occurred: "+io.getMessage());
        }
    }
}
