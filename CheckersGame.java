
public class CheckersGame {
    private char[][][] board;
    
    public CheckersGame () {
        board = new char[8][8][2];
        initializeBoard();
        initializePieces();
    }
    
    public void initializeBoard () {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                
                if ((r + c) % 2 == 0) { board[r][c][0] = ' ';
                } else {                board[r][c][0] = '.'; }
            }
        }
    }
    
    public void initializePieces () {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                
                if ((r + c) % 2 != 0) {
                    if (r < 3)      board[r][c][1] = 'W';
                    else if (r > 4) board[r][c][1] = 'B'; 
                } else
                    board[r][c][1] = ' ';
            }
        }
    }
    
    public void displayBoard () {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                
                if (board[r][c][1] == 'W' || board[r][c][1] == 'B')
                    System.out.print(board[r][c][1] + " ");
                else
                    System.out.print(board[r][c][0] + " ");
                
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        CheckersGame checkersGame1 = new CheckersGame();
        checkersGame1.displayBoard();
    }
}
