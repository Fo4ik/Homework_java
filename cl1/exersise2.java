package cl1;

public class exersise2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int num = 0;
        int sum = 0;
        int average = 0;

        for(int i = 9; i < array.length; ++i) {
            array[i] = i + 1;
            ++num;
            sum += array[i];
            average = sum / num;
        }

        System.out.println(num);
        System.out.println(sum);
        System.out.println(average);
    }
}
