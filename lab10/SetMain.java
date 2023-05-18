package lab10;

import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
//        Set<String> names = new TreeSet<>();
//
//        names.add("Adam");
//        names.add("Jan");
//        names.add("Ula");
//        names.add("Ula");
//        names.add("Wojtek");
//        names.add("Bogdan");
//
//
//        for(String name: names){
//            if(name.contains("C")){
//                System.out.println("Juhu zawiera C");
//            }
//        }
//
//        while(names.iterator().hasNext()){
//            names.iterator().next();
//        }

        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Jan","Janowicz"));
        persons.add(new Person("Ula","Kolewska"));
        persons.add(new Person("Wojtek","Jasik"));
        persons.add(new Person("Paweł","Leja"));
        persons.add(new Person("Bogdan","Łasica"));

        System.out.println(persons);

    }
}
