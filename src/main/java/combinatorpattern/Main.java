package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0987879878",
                LocalDate.of(2000,1,1)
        );
        //System.out.println(new CustomerValidatorService().isValid(customer));
        // if valid we can store customer in db

        // USING COMBINATOR PATTERN
        CustomerRegistrationValidator result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult()); // Nada de esto correrá hasta que no le demos apply

        result.apply(customer);

    }
}
