import java.util.Scanner;
public class GradeStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, max = 0, min = 100;

        System.out.println("Enter 10 grades (0-100):");

        for (int i = 1; i <= 10; i++) {
            while (true) {
                System.out.print("Grade " + i + ": ");
                if (input.hasNextDouble()) {
                    double grade = input.nextDouble();
                    if (grade >= 0 && grade <= 100) {
                        total += grade;
                        if (grade > max) max = grade;
                        if (grade < min) min = grade;
                        break;
                    }
                    System.out.println("Must be 0-100");
                } else {
                    System.out.println("Invalid input");
                    input.next();
                }
            }
        }

        System.out.println("\nResults:");
        System.out.printf("Average: %.2f\n", total / 10);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);

        input.close();
    }
}
