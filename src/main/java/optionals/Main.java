package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<IllegalStateException> exception_throw =
                () -> new IllegalStateException("exception throw");
        
        Object value = Optional.ofNullable("Hello ")
                .orElseThrow(exception_throw);
        System.out.println(value);
    }
}
