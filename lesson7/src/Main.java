public class Main {


    static int[] sub;
    static int count;
    static Utils utils;

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);

        }
        fillArray(a);
        System.out.println(average());

        utils = new Utils(a);
        utils.arrayOut();

        utils.defineLength();

        utils.fillArray();

        System.out.println(utils.average());


        int[] b = utils.getSub(); // Получаю подмассив через геттер
        int[] c = {3, 4, 5, 6};
        utils.setSub(c);
        System.out.println("Нихера не понятно.... ");
        System.out.println(utils.average());


        System.out.println("Подмассив: ");
        for (int i = 0; i < b.length; i++) {   // Вывожу подмассив
            System.out.print(b[i] + " ");    // Вывод в строку

            c = utils.sort(c);
            for (int j = 0; j < c.length; j++) {
                System.out.println(c[i] + "");
            }
            System.out.println();


        }
    }

        public static void fillArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0 && arr[i] != 0) {
                    System.out.println("Элемент кратный 3: " + arr[i]);
                    count++;
                    System.out.println("Счетчик, определяющий размер подмассива: " + count);
                }
            }
            sub = new int[count];
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0 && arr[i] != 0) {
                    sub[count] = arr[i];
                    System.out.println("Добавленный элемент : " + sub[count]);
                    count++;
                }
            }
        }


        public static double average () {
            double av = 0;
            for (int i = 0; i < sub.length; i++) {
                av += sub[i];
            }
            return av / sub.length;
        }

}