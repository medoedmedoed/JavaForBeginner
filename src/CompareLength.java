/*Задача №13: Сравнение двух строк
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
*/
import java.util.Scanner;

public class CompareLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 2 строки.\n Первая: ");
        String s1 = in.nextLine();
        System.out.print("\n вторая: ");
        String s2 = in.nextLine();
        if (s1.compareToIgnoreCase(s2) > 0)
            System.out.println("Большая из строк: " + s1);
        else if (s1.compareToIgnoreCase(s2) < 0)
            System.out.println("Большая из строк: " + s2);
        else System.out.println("Строки одинаковой длины.");
    }
}