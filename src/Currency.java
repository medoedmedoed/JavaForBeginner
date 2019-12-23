import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter exchange rate: ");
        double kurs = in.nextDouble();
        System.out.print("Enter the amount of RUR: ");
        double rub = in.nextDouble();
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(rub/kurs));
    }
}
