package imperative;

public class Customer {
    public final String customerName;
    public final String customerPhoneNumber;

    public Customer(String customerName, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);
    }

    public static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " +
                (showPhoneNumber ? customer.customerPhoneNumber: "*********"));
    }
}
