/**
 * Representation of 3 x 3 tic tac toe board
 * using two dimenional arrays
 */
 
public class TicTacToe
{
   public static void main(String[] args) {
      // this initializes the two-dimensional array
      char board[][] = { {'X','X','O'}, {'O', 'O', 'X'}, {'O', 'X',  'X'} };
      
      // output the two dimensional array
      
      // board.length is the number of rows
      for (int row = 0; row < board.length; row++) {
         // board[row].length is the number of columns in current row
         for (int col = 0; col < board[row].length; col++) {
            System.out.print(board[row][col] + " ");
         }
         
         System.out.println();
      }
   }   
}