package functionalinterface;

import imperative.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static imperative.Customer.greetCustomer;
import static imperative.Customer.greetCustomerV2;

public class _Consumer {

    public static void main(String[] args) {
        // NORMAL JAVA FUNCTION
        Customer customer = new Customer("Maria", "999999");
        greetCustomer(customer);
        greetCustomerV2(customer, false);

        // CONSUMER FUNCTIONAL INTERFACE
        greetCustomerConsumer.accept(customer);

        greetCustomerConsumerV2.accept(customer, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering " +
                    (showPhoneNumber ? customer.customerPhoneNumber: "*********"));


    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);



}
