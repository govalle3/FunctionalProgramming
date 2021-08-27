package streams;

import imperative.Gender;
import imperative.Person;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static imperative.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jhon", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        /*System.out.println("List of genders");
        people.stream()
                .map(person -> person.gender) // Convertimos la lista de people en una lista de generos
                .collect(Collectors.toSet()) // para remover duplicados
                .forEach(System.out::println);

        System.out.println("List of names");
        people.stream()
                .map(person -> person.name) // Convertimos la lista de people en una lista de nombres
                .collect(Collectors.toSet()) // para remover duplicados
                .forEach(System.out::println);

        System.out.println("Numero de letras de nombres");
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);
        people.stream()
                .map(personStringFunction) // Convertimos la lista de people en una lista de nombres
                .mapToInt(length)
                .forEach(println);
        *//*Del modo que tenemos arriba es lo que hemos venido aprendiendo, solo que no es necesario usarlos en los streams
        ya que ellos internamente ejecutan estas funciones que aprendimos en clases pasadas*//*

        // SIEMPRE ACOSTUMBRARSE A USAR STREAM, CONTIENE LAS FUNCIONES INTERNAMENTE
        people.stream()
                .map(person -> person.name) // Convertimos la lista de people en una lista de nombres
                .mapToInt(String::length)
                .forEach(System.out::println);*/

        Predicate<Person> personPredicate =
                person -> FEMALE.equals(person.gender);

        boolean containOnlyFemale = people.stream()
                .allMatch(personPredicate);

        System.out.println(containOnlyFemale);

        
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
