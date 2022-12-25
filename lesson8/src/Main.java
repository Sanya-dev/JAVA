import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.starCalculations();

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>= 10 && b < 5){       // Условия достижения true
            System.out.println("Попали в диапазон");
        }
        else {
            System.out.println("Не попали в диапазон");
        }
        //          Логическое выражение
//        System.out.println(a>= 10 && b < 5);

        if(a == 10 || b > 15){
            System.out.println(a == 10 || b > 15);
        }
        else  {
            System.out.println(a == 10 || b > 15);
        }

        switch (a){
            case 5:
                System.out.println("a= 5 is switch");
                break;
            case 6:
                System.out.println("a= 6 is switch");
                break;
            case 7:
                System.out.println("a= 7 is switch");
                break;
            case 8:
                System.out.println("a= 8 is switch");
                break;


            default:
                System.out.println("Значение не опознано");

        }



    }
}