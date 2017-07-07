/**
 * Created by John on 7/4/17.
 */
public class MatrixZero {

    public static void main(String[] args) {

        int[][] matrix = new int[][] {
            new int[] {1,2,3},
            new int[] {4,5,6},
            new int[] {7,8,9},
            new int[] {10,11,12}
        };

        setZero(matrix, 3, 2);
        outputMatrix(matrix);


    }

    public static void setZero(int[][] matrix, int row, int col) {
        matrix[row][col] = 0;

        for(int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }

        for(int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }

    public static void outputMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println("\n");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}
