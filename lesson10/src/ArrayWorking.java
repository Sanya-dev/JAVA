import java.util.Random;

public class ArrayWorking {
    int[] arr;
    int count;
    char[] chArr;

    Random random = new Random();
    public ArrayWorking(int size) {
        arr = new int[size];
        count = 0;
    }

    public ArrayWorking(){
        chArr = new char[10];
        count = 0;
    }


    public void insert(char value){
        chArr[count] = value;
        count++;
    }
    public void insert(int value){
        arr[count] = value;
        count++;
    }

    public void printArrayChar(){
        for (int i = 0; i < count; i++) {
            System.out.print(chArr[i] + " ");
        }
        System.out.println();
    }
    public void printArray(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void randomArray(){
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            count++;
        }
    }
    public void clearArray(){
        count = 0;
    }
}
