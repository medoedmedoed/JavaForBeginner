/*Задача №6: Отработка арифметических операций
Написать программу, которая будет выполнять следующие действия:
        1. Ввод трех чисел с клавиатуры x, y, z
        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
        3. Деление среднего арифметического на 2 без остатка
        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
*/
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int[] a = new int[3];
        int count = 0;        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 числа, чтобы получить их среднее значение:");
        for(int i = 0; i < 3; ++i){
            System.out.print("\n" + (i + 1) + "-ое число:");
            a[i] = in.nextInt();
            count+= a[i];
        }
        System.out.println("среднее значение = " + count/3);
        //System.out.println("среднее значение/2 = " + count/6);
        if(count/6 > 3) System.out.println("Программа выполнена корректно");
    }
}
