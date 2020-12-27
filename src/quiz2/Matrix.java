public class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) {
        String[] col = matrixAsString.split("\n");
        int rowLen = col[0].split(" ").length;
        int[][] matrix = new int[col.length][rowLen];
        for (int i = 0; i < col.length; i++) {
            String[] row = col[i].split(" ");
            for (int j = 0; j < row.length; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        this.matrix = matrix;
    }

    int[] getRow(int rowNumber) {
        int[] res = new int[this.matrix[0].length];
        for(int i = 0; i < matrix[0].length; i ++){
            res[i] = matrix[rowNumber - 1][i];
        }
        return res;
    }

    int[] getColumn(int colNumber) {
        int[] res = new int[this.matrix.length];
        for(int i = 0; i < matrix.length; i ++){
            res[i] = matrix[i][colNumber - 1];
        }
        return res;
    }
}