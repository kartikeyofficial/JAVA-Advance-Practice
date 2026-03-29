package in.KartikeyCoding.Challenge49;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    static void main(String[] args) {
        String filename = "Kartikey.txt";
        try(FileReader reader = new FileReader(filename)){
            int read;
            do {
               read =reader.read();
                System.out.print((char)read);
            }while (read!=-1);
        }
        catch (FileNotFoundException fnf){
            System.out.println("File Not Found exception is Occurred: "+fnf.getMessage());
        }
        catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
