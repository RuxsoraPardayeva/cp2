import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int steps = 0;

        System.out.println("Hailstone sequence:");

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            steps++;
        }

        System.out.println(1); // print final 1
        System.out.println("Total steps: " + steps);

        scanner.close();
    }
}
