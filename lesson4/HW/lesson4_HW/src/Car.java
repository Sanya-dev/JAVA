public class Car {
    int number1;
    int number2;

    public Car(int number1, int numder2) {
        this.number1 = number1;
        this.number2 = numder2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int numder2) {
        this.number2 = numder2;
    }

    public void printNew(){
        System.out.println(number1);
    }
    public void printTwo(){
        System.out.println("First = " + number1 + " Second = " + number2);
    }
    public int sum(){
        return number1+number2;
    }
    public int difference(){
        return number1-number2;
    }
}
