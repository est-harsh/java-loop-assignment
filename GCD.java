package Loops.Assignment;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Values");
        int a = scn.nextInt();
        int b = scn.nextInt();

        int gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i)
        {

            if(a % i==0 && b % i==0)
                gcd = i;
        }

        System.out.println("GCD of " + a +" and " + b + " is " + gcd);
    }
}