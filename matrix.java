public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposedMatrix = new int[3][3];

        // Transpose the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        // Print the transposed matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}