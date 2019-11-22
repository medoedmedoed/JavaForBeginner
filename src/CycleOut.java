/*
Задача №8: Цикличный вывод данных на экран
Необходимо с помощью цикла вывести на экран числа от 1 до 50.
*/
public class CycleOut {
    public static void main(String[] args) {
        /*for(int i = 0; i < 50 ; ++i){
            System.out.println(i+1);
        }*/
        int i = 0;
        /*while(++i < 51)
            System.out.println(i);*/
        do{
            ++i;
            System.out.println(i);
        }while(i < 50);
    }
}
