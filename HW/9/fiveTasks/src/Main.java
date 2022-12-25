import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//      task1();
//      task2(10);
//      task3();
//        task4();
//        task5();
        Squares squares = new Squares();
        squares.square();
    }

    public static void task1(){
        for (;;) {
            int input = scanner.nextInt();
            System.out.println("Выводим цифру: " + input);
        }
    }
    public static void task2(int a){
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        if (a > sum){
            System.out.println("Стандартное число больше чем сумма чисел которые вы ввели");
        } else if (a < sum) {
            System.out.println("Стандартное число меньше чем сумма чисел которые вы ввели");
        }else{
            System.out.println("Стандартное число равно сумме чисел которые вы ввели");
        }
    }

    public static void task3(){
        char a = scanner.next().charAt(0);
        switch (a){
            case '#':
                System.out.println("Вы ввели этот символ " + a);
                break;
            case '$':
                System.out.println("Вы ввели этот символ " + a);
                break;
            case '%':
                System.out.println("Вы ввели этот символ " + a);
                break;
            case '!':
                System.out.println("Вы ввели этот символ " + a);
                break;

            default:
                System.out.println("Ваш символ нам не известен");
        }
    }

    public static int[] task4(){
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {   // Заполняю массив значениями индексов)  (цикл)
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " "); // Выводим массив

        }
        return a;
    }
    public static void task5(){
        int[] arr = {5,2,3,7};
        int sum = 0;
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            multiply *=arr[i];
        }
        System.out.println("Сумма массива: " + sum);
        System.out.println("Произведение массива: " + multiply);
    }
}