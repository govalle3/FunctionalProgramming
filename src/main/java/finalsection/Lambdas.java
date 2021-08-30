package finalsection;

import java.util.Locale;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Function<String, String> upperCaseName = name -> name.toUpperCase(Locale.ROOT);
        //Function<String, String> upperCaseName = String::toUpperCase;
        Function<String, String> upperCaseName = name -> {
            // Logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

    }
}
