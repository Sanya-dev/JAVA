import java.util.Random;
import java.util.Scanner;

/*
    ДЗ
    1)Создать Scanner и организовать ввод чисел
    2) Проверить больше ли некоторого значения сумма двух чисел, если нет вывести сообщение что сумма меньше заданного значение
    3) Через case обработать несколько вариантов введенной переменной, предусмотреть дефолтный случай
    4) Инициализировать массив псевдослучайными числами(Random)
    5) Найти сумму и произведение всех элементов этого массива
    6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружности
     7) В классе Human добавить возможность изменения значений
     8) Написать 15 тернарных операторов
    9) Показать работу с методами классов String, StringBuilder и StringBuffer
    */

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    static Human human = new Human(29, "Alex");
    static StringBuffer AAA = new StringBuffer();
    public static void main(String[] args) {
//      task1();
//      task2(10);
//      task3();
//        task4();
//        task5();
        //TASK 6
        Squares squares = new Squares();
        squares.squareTreugolnik();
        System.out.println("Площадь круга равна " + squares.krug(5));
        System.out.println("Площадь прямоугольника равна " + squares.pryamougolnik(5,8));

        // Task 7
         System.out.println("Возраст : " + human.age + " \nИмя : " + human.name);
         changeHuman();

        //TASK 8
        // //condition ? value1 : value2
        // String str = "some string";
        // boolean a = 2 > 1 ? true : false;
        // System.out.println(a);
        // String b = 2 + 2 == 1 + 3 ? "значения равны" : "значения не равны";
        // System.out.println(b);
        // boolean c = str.length() > 15 ? true : false;
        // System.out.println(c);
        // int hour = 20;
        // String greeting = hour < 18 ? "Добрый день" : "Добрый вечер";
        // System.out.println(greeting);

        //TASK 9

        String str = " Some String ";
        int x = str.length();
        System.out.println(x);

        str = str.trim();
        System.out.println(str);

        char chr = str.charAt(2);
        System.out.println(chr);

        str = str.concat(" stringed");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);


        AAA.append("some stringBuffer");
        System.out.println(AAA);

        AAA.replace(0, 5, "");
        System.out.println(AAA);

        AAA.reverse();
        System.out.println(AAA);

        AAA.append(" olleH");
        System.out.println(AAA);

        AAA.reverse();
        System.out.println(AAA);

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
        //TASK 7
    public static void changeHuman() {
        human.setAge(30);
        human.setName("Vova");
        System.out.println("Возраст : " + human.age + " \nИмя : " + human.name);
    }

}