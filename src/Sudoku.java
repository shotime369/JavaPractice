import java.util.Arrays;
import java.util.Random;


public class Sudoku {

    public static int[] shuffleArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap array[i] with the element at random index
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }


    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int element : shuffleArray()) {
                System.out.print(element);
                if ((i + 1) % 3 == 0) {
                    System.out.print(" | ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            for (int element : shuffleArray()) {
                System.out.print(element);
            }
            System.out.print("\n");
        }
        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            for (int element : shuffleArray()) {
                System.out.print(element);
            }
            System.out.print("\n");
        }






        //int[] array1 = shuffleArray();

        // Declare and initialize a 3x3 grid
        //int[][] grid = new int[3][3];

        // Fill the grid with values from the one-dimensional array
       // int index = 0;
       // for (int i = 0; i < grid.length; i++) {
        //    for (int j = 0; j < grid[i].length; j++) {
         //       grid[i][j] = array1[index++];
         //   }
       // }
        // Print the grid
       // for (int i = 0; i < grid.length; i++) {
          //  for (int j = 0; j < grid[i].length; j++) {
            //    System.out.print(grid[i][j] + " ");
          //  }
            //System.out.println();
       // }
    }
}











