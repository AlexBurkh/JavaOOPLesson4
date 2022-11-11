package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Human {
    private final String firstName;
    private final String lastName;
    private int age;
    private final Sex sex;

    public Human(String firstName, String lastName, int age, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return  lastName + " " + firstName + ": " + sex + ", " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human human) {
            return (firstName.equals(human.getFirstName())) && (lastName.equals(human.getLastName())) &&
                    (age == human.getAge());
        }
        return false;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public Sex getSex() {
        return sex;
    }
    // Methods
}
