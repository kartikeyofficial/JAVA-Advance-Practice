package in.KartikeyCoding.FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestReader {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to file Reader:\n");
        String filename;
        do {
            System.out.print("Enter The File Name Do You Want to be Search: ");
             filename  = x.nextLine();
            try(FileReader reader = new FileReader(filename)){
                int read = 0;
                do {
                    read = reader.read();
                    System.out.print((char)read);
                }while (read != -1);

            }catch (IOException io){
                System.out.println("File is Not found: "+io.getMessage());
            }
        }while (filename.equals("JavaCourse.txt"));


    }
}
