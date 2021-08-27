package streams;

import imperative.Gender;
import imperative.Person;

import java.util.List;

import static imperative.Gender.FEMALE;
import static imperative.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jhon", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
    }

    enum Gender {
        MALE, FEMALE
    }


    static class Person {
        protected final String name;
        protected final imperative.Gender gender;

        public Person(String name, imperative.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

}
