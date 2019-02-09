package cl1;

import java.util.Random;

public class exersise6 {

    public static void main(String[] args) {
        int[][] a = new int[5][5];
        Random rnd = new Random();

        int i;
        int j;
        for(i = 0; i < a.length; ++i) {
            for(j = 0; j < a[i].length; ++j) {
                a[i][j] = rnd.nextInt(10) + 1;
            }
        }

        i = 0;

        while(i < a.length) {
            for(j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }

            ++i;
            System.out.println();
        }

    }
}
