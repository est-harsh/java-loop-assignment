package Loops.Assignment;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Value");
        int n = scn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers up to " + n + " is " + sum);



    }
}
