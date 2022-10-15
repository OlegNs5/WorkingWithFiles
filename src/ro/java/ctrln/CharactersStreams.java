package ro.java.ctrln;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharactersStreams {

    public static void main(String[] args) {
//        FileReader fileReader = null;//refactor
//        FileWriter fileWriter = null;//refactor

        try (FileReader fileReader = new FileReader("data.txt");
             FileWriter fileWriter = new FileWriter("data" + System.currentTimeMillis() + "txt")) {

            int charaterRead = fileReader.read();

            while(charaterRead != -1){
                fileWriter.write(charaterRead);
                charaterRead = fileReader.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit !");
            e.printStackTrace();
//            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("A aparut o excetie IOException");
//            throw new RuntimeException(e);
        }
    }
}
