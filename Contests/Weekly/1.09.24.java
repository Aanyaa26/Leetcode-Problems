You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.

Below is the chessboard for reference.
Return true if these two squares have the same color and false otherwise.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).


class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        int row1 = coordinate1.charAt(1)-'0';
        int col1 = coordinate1.charAt(0)-'A';

        int row2 = coordinate2.charAt(1)-'0';
        int col2 = coordinate2.charAt(0)-'A';

        int sum1 = (row1+col1);
        int sum2 = (row2+ col2);

        if ((sum1 % 2 == 0 && sum2 % 2 == 0) || (sum1 % 2 != 0 && sum2 % 2 != 0)){
            return true;
        }
        return false;
    }
}
