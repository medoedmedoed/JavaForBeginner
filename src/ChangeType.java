/*Задача №14: Преобразование типов
Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
*/

import java.util.Scanner;

public class ChangeType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.print("String S = " + S + "\nint X = " + X + "\ndouble Y = " + Y );
    }
}
