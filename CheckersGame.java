
import java.util.Scanner;

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
 
    public void move (char player, int startX, int startY, int endX, int endY) {
    	while (board[startX][startY][1] != player) {
    		Scanner invalidEntry = new Scanner(System.in);
    		System.out.println("ERROR: move() method: the starting coordinates you have selected contain either an opponent's piece or don't contain any piece at all.");
    		System.out.print("-enter a new set of starting coordinates | format: x y | range (both): 1-8: ");
    		startX = invalidEntry.nextInt();
    		startY = invalidEntry.nextInt();
    		while (startX < 1 || startX > 8 || endY < 1 || endY > 8) {
    			System.out.println("ERROR: move() method: the new starting coordinates you have selected fall outside the valid range of 1-8.");
    			System.out.print("-enter a new set of starting coordinates | format: x y | range (both): 1-8: ");
    			startX = invalidEntry.nextInt();
        		startY = invalidEntry.nextInt();
    		}
    		invalidEntry.close();
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
}
