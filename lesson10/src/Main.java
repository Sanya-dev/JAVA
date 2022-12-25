public class Main {
    public static void main(String[] args) {
        print(10);
        print('s');



        Human oldPass = new Human(25, "Alex", "Shyn", "Saschkowich");

        Human newPAss = new Human(25, "Alex", "Shyn");

        Human sexPass = new Human(18, " Vasya", "m");



        System.out.println("Старый пасспорт: " + oldPass.getAge() + " " + oldPass.getName() + " " + oldPass.getSurname() + " " + oldPass.getFathername());
        System.out.println("Новый пасспорт: " + newPAss.getAge() + " " + newPAss.getName() + " " + newPAss.getSurname() + " " );
        System.out.println("Пасспорт: " + sexPass.getAge() + " " + sexPass.getName() + " " + sexPass.getSex());

        ArrayWorking arrayWorking = new ArrayWorking(5);
        arrayWorking.insert(7);
        arrayWorking.printArray();
        arrayWorking.insert(9);
        arrayWorking.printArray();
        arrayWorking.randomArray();
        arrayWorking.printArray();

        ArrayWorking arrayWorkingChar = new ArrayWorking();
        arrayWorkingChar.insert('$');
        arrayWorkingChar.printArrayChar();

    }

    public static void print(int i){
        System.out.println("int: " + i);
    }
    public static void print(char c){
        System.out.println("char: " + c);
    }
}