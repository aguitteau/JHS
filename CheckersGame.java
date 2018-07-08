
public class CheckersGame {
    private char[][][] board;
    
    public CheckersGame () {
        board = new char[10][10][2];
        initializeBoard();
    }
    
    public void initializeBoard () {
        boolean squareColor = true;
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                
                if (squareColor) { board[r][c][0] = ' '; squareColor = !squareColor;
                } else {           board[r][c][0] = '·'; squareColor = !squareColor;
                }
                
            }
            
            squareColor = !squareColor;
        }
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
