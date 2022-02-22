package armstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int result = 0;
        int tempNumber;
        int digitNumber = 0;
        int digitValue;

        System.out.print("Please enter the number: ");
        number = scanner.nextInt();
        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }

        tempNumber = number;

        for (int i = 1; i <= digitNumber; i++) {

            digitValue = tempNumber % 10;
            result += digitValue;
            tempNumber /= 10;
        }
        System.out.println(result);

        scanner.close();
    }
}
