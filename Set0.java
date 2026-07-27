import java.util.Arrays;

class Set0{

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Find zeros
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {


                    for (int k = 0; k < cols; k++) {

                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }

                    for (int k = 0; k < rows; k++) {

                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}