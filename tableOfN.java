package Loops.Assignment;

import java.util.Scanner;

public class tableOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Value");
        int n = scn.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }



    }
}
