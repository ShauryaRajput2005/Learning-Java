package Recursion;

public class sudoku_solver {

    // Method to check if it's safe to place the number
    public boolean isSafe(char[][] board, int row, int col, int num) {
        // Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }

        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (num + '0')) {
                return false;
            }
        }

        // Check the 3x3 grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    // Recursive solver method
    public boolean solver(char[][] board, int row, int col) {
        // If we have reached the end of the board
        if (row == board.length) {
            return true;
        }

        // Move to the next row if we are at the end of a column
        int nrow = row, ncol = col + 1;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        }

        // If the current position is already filled, move to the next
        if (board[row][col] != '.') {
            return solver(board, nrow, ncol);
        } else {
            // Try to place numbers from 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0'); // Place the number

                    // Recur to place the next number
                    if (solver(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // Backtrack if placing the number didn't lead to a solution
                    }
                }
            }
        }

        return false; // Return false if no number can be placed in the current cell
    }

    // Method to solve the Sudoku
    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Create an instance of sudoku_solver
        sudoku_solver solver = new sudoku_solver();
        solver.solveSudoku(board);

        // Print the solved Sudoku board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
