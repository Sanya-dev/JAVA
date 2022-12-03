public class Main {
    public static void main(String[] args) {

        System.out.println(sum(5,5));
        run(10,20);




    Car car = new Car(10000, 200, "Фольксваген");
    System.out.println("price = " + car.getPrice() + " speed = " + car.getSpeed() + " brand = " + car.getBrand());
    car.printOut();
    Car car1 = new Car(2000, 220, "Бугатти");
    car1.printOut();
    Human human = new Human(1.8, 77.5, "Alex");
    System.out.println("height = " + human.getHeight() + " weight = " + human.getWeight() + " name = " + human.getName());
    human.printOut();
    human.setHeight(2.2);
    System.out.println("height = " + human.getHeight() + " weight = " + human.getWeight() + " name = " + human.getName());



}
    static int sum(int a, int b){
        return a + b;
    }
    static void run(int a, int b){
        System.out.println("a = " + a + " b = " + b);
        }

}
