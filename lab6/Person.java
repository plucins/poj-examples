package lab6;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dayOfBirth;

    public Person(String firstName, String lastName, LocalDate dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(firstName, person.getFirstName()) && Objects.equals(lastName, person.getLastName())
                && Objects.equals(dayOfBirth, person.dayOfBirth);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " urodził się: " + dayOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dayOfBirth);
    }

    public static void printPersons(boolean isOk, Person... people) {
        if (isOk) {
            for (Person p : people) {
                System.out.println(p);
            }
        }
    }

}
