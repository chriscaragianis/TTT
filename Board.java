import java.util.*;

class Board{

  private static String[][] board;

  public String getBoard(int row, int col){
    return board[row][col];
  }

  public void startBoard(int length){
    board = new String[length][length];
    for(int i = 0; i < length; i++){
      for(int j = 0; j < length; j++){
        board[i][j] = "-";
      }
    }
    int position = 0;
    board[position + 2][position] = "X";
    board[position + 1][position + 1] = "X";
    board[position][position + 2] = "X";
  }

  public boolean isFull(){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == "-"){
          return false;
        }
      }
    }
    return true;
  }

  public void makeBoard(){
    System.out.println("-------");
    System.out.println("| | | |");
    System.out.println("-------");
    System.out.println("| | | |");
    System.out.println("-------");
    System.out.println("| | | |");
    System.out.println("-------");
  }

  public void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 3; i++) {
      System.out.print("| ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }
}
