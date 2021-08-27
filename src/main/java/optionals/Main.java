package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello ")
                .orElseGet(() -> "default value");
        System.out.println(value);
    }
}
