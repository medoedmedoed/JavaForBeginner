/*Задание №9: Ввод/вывод данных для массива
Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.
*/
import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  размер массива:");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; ++i) {
            System.out.print("\nВведите значение " + i + "-ого элемента:");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; ++i) {
            System.out.print("\nЗначение " + i + "-ого элемента = " + array[i]*2);
        }
    }
}
