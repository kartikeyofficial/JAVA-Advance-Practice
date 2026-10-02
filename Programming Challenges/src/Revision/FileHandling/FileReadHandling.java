package Revision.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadHandling {
    static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the File Name: ");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
             do {
                read =reader.read();
                System.out.print((char)read);
            }while (read!=-1);

        }catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch (IOException io){
            System.out.println(io.getMessage());
        }

    }
}
