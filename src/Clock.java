import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {

                    if (count > totalSeconds) {
                        scanner.close();
                        return;
                    }

                    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
                    count++;
                }
            }
        }

        scanner.close();
    }
}
