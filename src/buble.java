/*Задача №15: Сортировка данных в массиве
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.*/

import java.util.Scanner;

public class buble {
    public static void main(String[] args) {
        //int[] arr = {9,1,2,6,4,3,0,5,8,7};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }
        int tmp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i:arr) {
            System.out.print(i + " ");;
        }
    }
}
