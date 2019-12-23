import java.util.Scanner;


public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter binary number: ");
        int binary = in.nextInt();
        int dec = 0;
        for (int i = 0 ;binary > 0; binary/=10, i++) {
            dec += (binary % 10)*(Math.pow(2,i));
        }
        System.out.println(dec);
    }
}
