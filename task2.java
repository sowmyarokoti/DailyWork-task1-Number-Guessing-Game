package dailywork;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int sum = 0;

        // Taking marks input
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int m = sc.nextInt();
            sum += m;
        }

        // Calculate average
        double avg = (double) sum / n;

        // Grade logic
        String g;
        if (avg >= 90) {
            g = "A+";
        } else if (avg >= 80) {
            g = "A";
        } else if (avg >= 70) {
            g = "B";
        } else if (avg >= 60) {
            g = "C";
        } else if (avg >= 50) {
            g = "D";
        } else {
            g = "F";
        }

        // Output
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + g);

        sc.close();
    }
}

