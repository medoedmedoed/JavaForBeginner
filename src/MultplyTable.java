//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
import java.util.Scanner;

public class MultplyTable {

    static void multyply(int a, int i) {
        if(i<11){
            System.out.println(a + " * " + i + " = " + a * i);
        ++i;
        multyply(a, i);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number: ");
        multyply(in.nextInt(),1);
    }
}
