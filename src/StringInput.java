/*Задача №11: Ввод строки с клавиатуры
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
*/
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку с клавиатуры: ");
        String str = in.nextLine();
        System.out.println("Вы ввели: \""+ str + "\"");
    }
}