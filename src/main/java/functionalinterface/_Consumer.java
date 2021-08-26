package functionalinterface;

import imperative.Customer;

import java.util.function.Consumer;

import static imperative.Customer.greetCustomer;

public class _Consumer {

    public static void main(String[] args) {
        // NORMAL JAVA FUNCTION
        Customer customer = new Customer("Maria", "999999");
        greetCustomer(customer);

        // CONSUMER FUNCTIONAL INTERFACE
        greetCustomerConsumer.accept(customer);

    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);



}
