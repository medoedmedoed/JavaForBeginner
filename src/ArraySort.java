import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  размер массива:");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            System.out.print("\nВведите значение " + i + "-ого элемента:");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println("\nsort array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}