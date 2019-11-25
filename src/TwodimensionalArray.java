/*Задание №10: Ввод/вывод данных для матрицы
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем
 */
import java.util.Scanner;

public class TwodimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы массива:\nколичество строк:");
        int n = in.nextInt();
        System.out.print("\nколичество столбцов:");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print("\nВведите значение [" + i + "][" + j + "] элемента:");
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; ++i) {
            System.out.print("\nзначение [" + 0 + "][" + i + "] элемента=" + array[0][i]*3);
        }
    }
}
