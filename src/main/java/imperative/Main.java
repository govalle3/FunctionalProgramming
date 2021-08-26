package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jhon", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // IMPERATIVE APPROACH
        System.out.println("/ Imperative approach");
        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female: females){
            System.out.println(female);
        }

        // DECLARATIVE APPROACH
        System.out.println("/ Declarative approach");
                // Mismo procedimiento anterior pero extrayendo una variable de tipo lista e imprimiendo
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        // Acepta una persona y devuelve un booleano basado en que cualquier persona sea de tipo FEMENINO
        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }
}
