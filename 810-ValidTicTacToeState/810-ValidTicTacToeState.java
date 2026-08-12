// Last updated: 8/12/2026, 10:21:14 PM
class Solution {
    public boolean win(String[] board, char p) {
        // Check rows and columns
        for (int i = 0; i < 3; ++i) {
            if (board[i].charAt(0) == p && board[i].charAt(1) == p && board[i].charAt(2) == p) return true;
            if (board[0].charAt(i) == p && board[1].charAt(i) == p && board[2].charAt(i) == p) return true;
        }
        // Check diagonals
        if (board[0].charAt(0) == p && board[1].charAt(1) == p && board[2].charAt(2) == p) return true;
        if (board[0].charAt(2) == p && board[1].charAt(1) == p && board[2].charAt(0) == p) return true;
        
        return false;
    }

    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        
        for (String row : board) {
            for (int i = 0; i < 3; ++i) {
                if (row.charAt(i) == 'X') xCount++;
                if (row.charAt(i) == 'O') oCount++;
            }
        }
        
        // Rule 1: X moves first, so X count should be equal to O or O + 1
        if (xCount < oCount || xCount > oCount + 1) return false;
        
        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');
        
        // Rule 2: Both players cannot win at the same time
        if (xWin && oWin) return false;
        
        // Rule 3: If X wins, X must have made the last move (xCount == oCount + 1)
        if (xWin && xCount != oCount + 1) return false;
        
        // Rule 4: If O wins, O must have made the last move (xCount == oCount)
        if (oWin && xCount != oCount) return false;
        
        return true;
    }
}