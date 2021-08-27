package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09080770000"));
        System.out.println(isPhoneNumberValid("074080770000"));
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09080770000"));
        System.out.println(isPhoneNumberValidPredicate.test("074080770000"));

        System.out.println(
                "Is phone number valid an contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("074080770000")
        );

        System.out.println(
                "Is phone number valid an contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000003000")
        );

        System.out.println(
                "Is phone number valid an contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000")
        );

    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
    
}
