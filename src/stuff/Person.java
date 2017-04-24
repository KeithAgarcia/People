package stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Keith on 4/11/17.
 */
public class Person implements Comparable {
    String id;
    String firstName;
    String lastName;
    String eMail;
    String location;
    String iPadress;
    public boolean sort;


    public Person(String id, String firstName, String lastName, String eMail, String location, String iPadress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.location = location;
        this.iPadress = iPadress;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return lastName.compareTo(p.lastName);
        //return this.iD - p.iD;
    }
    @Override
    public String toString(){ // prints toString of every value inside it. %s = string; %d = integer; %f = double.
        return String.format( "%s %s from %s", firstName, lastName, location);
    }
}

//String.format( "%s %s from %s", firstName, lastName, location);
