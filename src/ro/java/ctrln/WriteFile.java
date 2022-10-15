package ro.java.ctrln;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        byte[] contentArray = Files.readAllBytes(Paths.get("data.txt"));

        System.out.println(new String(contentArray));

        Files.write(Paths.get("output.txt" + System.currentTimeMillis()),"Text pe care il scriem in fisier".getBytes());
    }
}
