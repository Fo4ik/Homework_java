package cl2.homework;


import java.util.Arrays;
import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arr[] = arrsqrt();
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrsqrt() {
        Scanner s = new Scanner(System.in);
        int raylangth = s.nextInt();
        int arr[] = new int[raylangth];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }

        return arr;
    }
}
