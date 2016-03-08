import java.util.*;

class Board{

  private static String[][] board;

  public String getBoard(int row, int col){
    return board[row][col];
  }

  public void setBoard(String playerName, int row, int col){
    board[row][col] = playerName;
  }

  public void startBoard(int length){
    board = new String[length][length];
    for(int i = 0; i < length; i++){
      for(int j = 0; j < length; j++){
        board[i][j] = "-";
      }
    }
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

  public String toString() {
    String result;
    result = "-------------\n";
    for (int i = 0; i < 3; i++) {
      result += "| ";
      for (int j = 0; j < 3; j++) {
        result += board[i][j] + " | ";
      }

      result += "\n-------------\n";
    }
    return result;
  }
}
