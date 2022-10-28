package ro.java.ctrln.simulationLog;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Scanner;

public class SimulateLogging {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        int index = 0;

        try (Scanner scanner = new Scanner(new FileInputStream("persons.txt"))) {
            while (scanner.hasNext()) {
                String personLine = scanner.nextLine();
                String[] personsComponens = personLine.split("\\|");
                System.out.println("Linia citita este: " + personLine);

                for (int i = 0; i < personsComponens.length; i++) {
                    System.out.println("\tComponetul : " + i + " este " + personsComponens[i]);
                }
                int personAge = "".equals(personsComponens[2]) ? 0 : Integer.parseInt(personsComponens[2]);
                String job = personsComponens.length == 4 ? personsComponens[3] : "";
                Person person = new Person(personsComponens[0], personsComponens[1], personAge, job);
                System.out.println("Persoana scanata este: " + person);
                persons[index] = person;
                index++;
            }


        } catch (IOException ioe) {
            System.out.println("A aparul o IOException");
        }
        Path path = Paths.get("persons-output" + System.currentTimeMillis() + ".txt");
        for (Person person : persons) {
            try {
                if (person.getAge() == 0) {
                    throw new PersonException(Severity.ERROR + " " + "- Virsta nu este corespunzatoare!" + " " + person.getFirstName()+"\n");
                }
                if ("".equals(person.getJob())){
                    writeToLog(Severity.WARN.name() + " - " + person.toString() + "\n",path);
                }else {
//                Files.write(path, (Severity.INFO.name() + " " + person.toString()).getBytes());
                    writeToLog(Severity.INFO.name() + " - " + person.toString() + "\n", path);
                }
            } catch (PersonException pe) {
                writeToLog(pe.getMessage(), path);
//                Files.write(path, pe.getMessage().getBytes());
             }
        }
    }     private static void writeToLog(String message,Path path){
            try{
                if (!Files.exists(path)) {
                    Files.write(path, (LocalDateTime.now().toString() + " - " + message).getBytes(), StandardOpenOption.CREATE_NEW);
                }else {
                    Files.write(path, (LocalDateTime.now().toString() + " - " + message).getBytes(), StandardOpenOption.APPEND);
                }
            }catch(IOException io){
                System.out.println("Nu putem sa scriem in fisierul log !");
                
            }
     }
}
