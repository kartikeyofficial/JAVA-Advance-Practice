package in.KartikeyCoding.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadNewFile {
    static void main(String[] args) {
        String fileName="/home/kartikey/Documents/hibernate.txt";

        try(FileReader reader = new FileReader(fileName)){
            int read;
            do {
                read = reader.read();
                System.out.print((char)read);
            }while (read != -1);
        }
        catch (FileNotFoundException fnf){
            System.out.println("File Not Found: "+fnf.getMessage());
        }
        catch (IOException io){
            System.out.println("Exception Found: "+io.getMessage());
        }

    }
}
