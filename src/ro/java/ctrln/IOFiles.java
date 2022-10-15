package ro.java.ctrln;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOFiles {
    public static void main(String[] args) {

//        FileInputStream fileInputStream = null; //refactor
//        FileOutputStream fileOutputStream = null; //refactor

        try( FileInputStream fileInputStream = new FileInputStream("data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt" + System.currentTimeMillis())) {
//            fileInputStream = new FileInputStream("data.txt"); //refactor
//            fileOutputStream = new FileOutputStream("output.txt"); //refactor

            int read = fileInputStream.read();

                                while (read != -1){//atita timp cit nu aam ajunt la capatul fisierului
                fileOutputStream.write(read);
                read = fileInputStream.read();
            }
            System.out.println("Citire si scriere completa !");

        }catch(FileNotFoundException fnfe){
            System.out.println("Fisierul nu a fost gasit !");
        }catch(IOException ioe){
            System.out.println("IOException a aparut");
        }
    }
}