import java.util.Random;

public class Matrix {
    Random random = new Random();
    public int[][] createMatrix(int row, int col) throws InterruptedException {
    int[][] mtx = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtx[i][j] = random.nextInt(10);

            }

        }
        return mtx;
    }
    public void printMTX(int[][] mtx) throws InterruptedException {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
              
            }
            System.out.println();
//            Thread.sleep(1000);
        }
    }
    
    public void findMaxes(int[][] mtx){
        for (int i = 0; i < mtx.length; i++) {
            int max = mtx[i][0];
            for (int j = 0; j < mtx[i].length; j++) {
                if(mtx[i][j] > max){
                    max = mtx[i][j];
                }
            }
//            System.out.println("Максимум строки: " + i + " Равен: " + max);

        for (int j = 0; j < i*3; j++) {
            System.out.print(" ");
        }
        System.out.println(max);
    }
    }

}
