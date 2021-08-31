package finalsection;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Function<String, String> upperCaseName = name -> name.toUpperCase(Locale.ROOT);
        //Function<String, String> upperCaseName = String::toUpperCase;
        System.out.println(upperCaseName.apply("Alex", 20));
    }

    static BiFunction<String, Integer,  String> upperCaseName = (name, age) -> {
        // Logic
        if(name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
    };
}
