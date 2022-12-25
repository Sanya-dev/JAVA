import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(linearEquation(2,10));
        System.out.println("Введите первый параметр: ");
        int a = scanner.nextInt();

        System.out.println("Введите второй параметр: ");
        int b = scanner.nextInt();

        System.out.println("Введите третий параметр: ");
        int c = scanner.nextInt();

        if(isRoots(findDiscriminant(a, b, c))){
            if(isTwoRoots(findDiscriminant(a, b, c)){

            }else {
                
            }
        }
    }


    static public double linearEquation(double x, double a){
        return a/x;
    }


    public double findDiscriminant(double a, double b, double c){
        return Math.pow(b, 2) - 4*a*c;
    }
    public boolean isRoots(double discriminant){
        if(discriminant < 0){
            return false;
        }else {
            return true;
        }
    }
    public boolean isTwoRoots(double discriminant){
        if( discriminant == 0){
            return false;
        } else {
            return true;
        }
    }
    public double singleRoot(double a, double b, double discriminant){
        return (-b - Math.sqrt(discriminant))/(2*a);
    }

    public double[] doubleRoot(double a, double b, double discriminant){
        double[] arr = new double[2];                   // Находим два корня
        arr[0] = singleRoot(a, b, discriminant);
        arr[1] = (-b + Math.sqrt(discriminant))/(2*a);

        return arr;
    }
}