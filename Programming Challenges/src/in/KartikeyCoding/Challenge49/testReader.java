package in.KartikeyCoding.Challenge49;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class testReader {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to file Reader:\n");
        String filename;
            System.out.print("Enter The File Name Do You Want to be Search: ");
            filename  = x.nextLine();
            try(FileReader reader = new FileReader(filename)){
                int read;
                do {
                    read = reader.read();
                    System.out.print((char)read);
                }while (read != -1);

            }catch (FileNotFoundException fnf){
                System.out.println("File Not Found: "+filename);
            }
            catch (IOException io){
                System.out.println("Exception occurs: "+io.getMessage());
            }
    }
}
