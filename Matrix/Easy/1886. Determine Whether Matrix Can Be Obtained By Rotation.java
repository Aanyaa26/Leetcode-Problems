Date: 13.10.24
class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        // Function to rotate the matrix 90 degrees clockwise
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(matrix, target)) {
                return true; // If they are equal, return true
            }
            rotate(matrix); // Rotate the matrix for the next check
        }
        return false; // If no rotations matched, return false
    }

    // Function to rotate the matrix 90 degrees clockwise
    private void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
