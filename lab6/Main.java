package lab6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Adam", "Adamowicz" , LocalDate.of(2000,1,1));
        Person p1 = new Person("Adam", "Adamowicz" , LocalDate.of(2000,1,1));


//        System.out.println(p.equals(p1));
//        System.out.println(p1.equals(p1));
//
//        System.out.println(p.hashCode());
//        System.out.println(p1.hashCode());
//
        Person.printPersons(true, p, p1, new Person("Jan", "Janowicz", LocalDate.of(2000,5,5)));
    }
}
