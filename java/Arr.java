import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = random.nextInt(100);
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}



