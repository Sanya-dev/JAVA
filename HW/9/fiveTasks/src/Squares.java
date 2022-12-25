public class Squares {
    private double height;
    private double width;
    private double area;


    public void square(){
        System.out.println("Введите высоту треугольника ");
        double height = Main.scanner.nextInt();
        System.out.println("Введите ширину треугольника ");
        double width = Main.scanner.nextInt();
        double area = (height*width)/ 2;
        System.out.println("Площадь треугольника равна " + area);
    }
}
