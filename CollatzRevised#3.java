/**
 * Demonstration of declaring and using a method
 */

import java.util.Scanner;

public class CollatzRevised#3
{
    public static int summation(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner fromUser = new Scanner(System.in);
        int number;
        int value;

        System.out.print("Enter a value: ");
        number = fromUser.nextInt();

        value = summation(number);

        System.out.println("The summation of " + number + " is " + value);
    }
}
