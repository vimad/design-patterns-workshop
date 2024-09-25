package playground;

import java.util.*;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String ssn;

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public static final Comparator<Person> NATURAL_COMPARATOR =
        Comparator.comparing(Person::getLastName)
            .thenComparing(Person::getFirstName)
            .thenComparingInt(Person::getAge)
            .thenComparing(Person::getSsn);

    @Override
    public int compareTo(Person o) {
        return NATURAL_COMPARATOR.compare(this, o);
    }

    // @Override
    // public int compareTo(Person o) {
    //     int result = lastName.compareTo(o.lastName);
    //     if (result == 0) result = firstName.compareTo(o.firstName);
    //     if (result == 0) result = age - o.age;
    //     if (result == 0) result = ssn.compareTo(o.ssn);
    //     return result;
    // }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }
}
