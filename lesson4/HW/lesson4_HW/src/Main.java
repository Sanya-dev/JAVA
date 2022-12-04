public class Main {
    public static void main(String[] args) {

        //Task 1
        String str;
        str = "Hallo Bro";
        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.toUpperCase());
        System.out.println(str.isEmpty());
        System.out.println(str.replace("Hallo Bro","Good Bye"));

        //Task 2
        double f = 15.00;
        short c = (short)f;
        System.out.println(c);

        //Task 3
        double i = 1000000000 + 2000000000;
        System.out.println(i);

        //Task 4
        Car car = new Car(10,5);
        car.printNew();
        car.printTwo();
        System.out.println(car.sum());
        System.out.println(car.difference());

        //Task 5
        String str1 = "? алед каК ";
        str1 = reverse(str1);
        System.out.println(str1);


    }
        public static String reverse(String str1) {
        return new StringBuilder(str1).reverse().toString();
    }
}