public class Array2d {

        public static void main(String[] args) {
            // Create a 2x3 matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            // Print the elements of the matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }



