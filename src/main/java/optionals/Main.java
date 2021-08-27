package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // logic to do business logic
        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sending email to " + email));
    }
}
