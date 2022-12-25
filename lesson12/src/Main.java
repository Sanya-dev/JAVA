import java.util.Random;

public class Main {
    static Random random = new Random();
    static int[][] ntx = new int [10][10];
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                ntx [i][j] = random.nextInt(10);
//                System.out.print(ntx[i][j] + "  ");
//            }
//            System.out.println();
//            Thread.sleep(1000);
//        }

        Matrix matrix = new Matrix();
        int[][] newMtx = matrix.createMatrix(10,20);
        matrix.printMTX(newMtx);
        matrix.findMaxes(newMtx);
    }


}