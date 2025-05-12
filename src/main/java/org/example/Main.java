package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("\nMenu:");
            System.out.println("1. Substring Fun");
            System.out.println("2. Run of Integers");
            System.out.println("3. Sum of a Range");
            System.out.println("4. Repeat Word");
            System.out.println("5. Words Separated by Dots");
            System.out.println("6. Adding Up Integers");
            System.out.println("7. Shipping Cost Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    substringFun(scanner);
                    break;
                case 2:
                    runOfIntegers(scanner);
                    break;
                case 3:
                    sumOfRange(scanner);
                    break;
                case 4:
                    repeatWord(scanner);
                    break;
                case 5:
                    wordsWithDots(scanner);
                    break;
                case 6:
                    addingUpIntegers(scanner);
                    break;
                case 7:
                    shippingCostCalculator(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void substringFun(Scanner scanner) {
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        System.out.print("Enter beginning index: ");
        int begin = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter ending index: ");
        int end = Integer.parseInt(scanner.nextLine());

        System.out.println("\nOriginal string:\n" + text);
        if (begin >= 0 && end <= text.length() && begin < end) {
            String sub = text.substring(begin, end);
            System.out.println("\nSubstring:\n" + sub);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public static void runOfIntegers(Scanner scanner) {
        System.out.print("Enter Start: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter End: ");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void sumOfRange(Scanner scanner) {
        System.out.print("Enter low: ");
        int low = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter high: ");
        int high = Integer.parseInt(scanner.nextLine());

        int sumHigh = (high * (high + 1)) / 2;
        int sumLowMinus1 = ((low - 1) * low) / 2;

        int sum = sumHigh - sumLowMinus1;
        System.out.println("Sum = " + sum);
    }

    public static void repeatWord(Scanner scanner) {
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int times = word.length();
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void wordsWithDots(Scanner scanner) {
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        int totalLength = word1.length() + word2.length();
        int dotCount = 30 - totalLength;

        System.out.print(word1);
        for (int i = 0; i < dotCount; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }

    public static void addingUpIntegers(Scanner scanner) {
        System.out.print("How many integers will be added: ");
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }

        System.out.println("The sum is " + sum);
    }

    public static void shippingCostCalculator(Scanner scanner) {
        while (true) {
            System.out.print("Weight of Order: ");
            double weight = Double.parseDouble(scanner.nextLine());

            if (weight <= 0) {
                System.out.println("bye");
                break;
            }

            double cost = 3.00;
            if (weight > 10) {
                cost += (weight - 10) * 0.25;
            }

            System.out.printf("Shipping Cost: $%.2f%n", cost);
        }
    }
}
