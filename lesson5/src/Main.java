import java.util.Scanner;

public class Main {

//if - условный оператор, направляющий исполнение программы по тому или иному пути, в зависимотси от условия:
//            if(условие){
//        тело
//    }
//      else{
//        тело
//    }
//    Операторы сравнения
//      == - равно
//      >  - больше
//            <  - меньше
//      => - больше или равно
//      =< - меньше или равно
//      !=  - неравно
//      && - и       and
//      || - или      or
//      ^ - исключающее или   xor(иксор)






    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int c = scanner.nextInt();
//        if(c < 1 || c > 5){
//            System.out.println("Nice");
//        } else if(c==4){
//            System.out.println("well");
//        } else if (c==3) {
//            System.out.println("Not bad");
//        }else{
//            System.out.println("Other");
//        }



//        for (int i = 0; i < 10; i++){
//
//        }
//        int x = 10, z = 10;                           // Ничего не меняется
//        x++;
//        ++z;
//
//        System.out.println();
//
//        System.out.println("x: " + x + ", z: " + z);
//
//        int x1 = 10, c1 = 10;                              // Форма имеет значение
//        final int y1 = 13 - x1++;
//        final int z1 = 13 - ++c1;
//
//        System.out.println("y: " + y1 + ", z: " + z1);
//
//
        char ex;
        for (; ; ) {                                     // Оцениваем группу. Пример бесконечного цикла
            System.out.println("Введите оценку: ");
            int c = scanner.nextInt();

            if(c < 1 || c > 5) {                             // Проверяем диапазон ввода
                System.out.println("Оценка вне диапазона ");
            }
            else {                                           // Если оценка в диапазоне, переходим к блоку
                if (c == 5) {                                 // Блок if
                    System.out.println("Отлично");
                } else if (c == 4) {
                    System.out.println("Хорошо");
                } else if (c == 3) {
                    System.out.println("Удовлетворительно");
                } else {
                    System.out.println("Плохо");
                }
            }

            System.out.println("Выберите операцию: " +
                    "\n c - продолжить " +
                    "\n e - выход");

            ex = scanner.next().charAt(0);            // Считываем нулевой символ ввода

            if(ex == 'e'){                // Проверяем ввод
                break;           // Выход из цикла
            }

        }

    }
}