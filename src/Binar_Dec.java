//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
import java.util.Scanner;

public class Binar_Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter binary number: ");
        String binary = in.nextLine();
        int dec = Integer.parseInt(binary, 2);
        System.out.println("binary = " + binary + "\ndec = " + dec );
    }
}