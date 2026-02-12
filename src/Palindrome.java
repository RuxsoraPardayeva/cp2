import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number = number / 10;         // remove last digit
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}
