package cl1;

import java.util.Scanner;

public class exersise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = s.nextInt();
        int i;
        int j;
        if (num % 2 == 0) {
            for(i = 2; i <= num; ++i) {
                for(j = 2; j <= i; ++j) {
                    if (num % j == 0) {
                        System.out.print(j + " ");
                        num /= j;
                    }
                }
            }
        }

        if (num % 3 == 0) {
            for(i = 2; i <= num; ++i) {
                for(j = 2; j <= i; ++j) {
                    if (num % j == 0) {
                        System.out.print(j + " ");
                        num /= j;
                    }
                }
            }
        }

        if (num % 5 == 0) {
            for(i = 2; i <= num; ++i) {
                for(j = 2; j <= i; ++j) {
                    if (num % j == 0) {
                        System.out.print(j + " ");
                        num /= j;
                    }
                }
            }
        }

    }
}
