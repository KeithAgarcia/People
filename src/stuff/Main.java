package stuff;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        File peopleFile = new File("people.csv");

        Scanner fileScanner = new Scanner(peopleFile);
        fileScanner.nextLine();

        while (fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\,");
            Person person = new Person(columns[0], columns[1], columns[2], columns [3], columns[4], columns[5]);
            people.add(person);
        }
        Collections.sort(people);
    }
}

//method that will convert any objects to string. toString.