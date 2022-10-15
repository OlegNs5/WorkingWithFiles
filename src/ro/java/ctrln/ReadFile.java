package ro.java.ctrln;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path path =  Paths.get("data.txt");
        byte[] ContenntArray = Files.readAllBytes(path);//(Paths.get("data.txt")); //Sau se poate si fara variabila path de tipul Path

        String content = new String(ContenntArray);
        System.out.println(content);
    }
}
