package ro.java.ctrln;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScanningFiles {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new FileInputStream("data.txt"))){
            while(scanner.hasNext()){
                System.out.println("Linia citita : "+scanner.nextLine());
            }
        }catch(IOException ioe){
            System.out.println("O IOExceptie a aparut ! ");
        }
    }
}
