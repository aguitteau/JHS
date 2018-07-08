
public class CheckersGame {
    private char[][][] board;
    
    public CheckersGame () {
        board = new char[8][8][2];
        initializeBoard();
    }
    
    public void initializeBoard () {
        boolean squareColor = true;
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                
                if ((r + c) % 2 == 0) {
                    board[r][c][0] = ' ';
                } else {
                    board[r][c][0] = '.';
                }
                
                
            }
            
            squareColor = !squareColor;
        }
    }
    
    public void initializePieces () {
        
    }
    
    public void displayBoard () {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
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
