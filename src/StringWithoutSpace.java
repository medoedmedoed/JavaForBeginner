/*Задача №12: Удаление всех пробелов в заданном тексте
Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
*/
import java.util.Scanner;

public class StringWithoutSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 2 строки.\nПервая: ");
        String s1 = in.nextLine();
        System.out.print("\nвторая: ");
        String s2 = in.nextLine();
        String[] S1 = s1.split(" ");
        String[] S2 = s2.split(" ");
        System.out.print("Первая строка без пробелов: \"");
        for (String s: S1) {
            System.out.print(s);
        }
        System.out.print("\"\nвторая строка без пробелов: \"");
        for (String s: S2) {
            System.out.print(s);
        }
        System.out.print("\"");
    }
}
