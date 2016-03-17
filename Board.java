import java.util.*;

class Board{

  private static String[][] board;
  public Scanner move = new Scanner(System.in);

//get information from the private board 2D array
  public String getBoard(int row, int col){
    return board[row][col];
  }

//Allow the first player makes a move
  public void makeMoveX(){
    int y = move.nextInt();
    int x = move.nextInt();
    if(board[x][y] == "-"){
      board[x][y] = "X";
    }else{
      System.out.println("Cannot make that move!");
    }
  }

//Allow the second player makes a move
  public void makeMoveO(){
    int y = move.nextInt();
    int x = move.nextInt();
    if(board[x][y] == "-"){
      board[x][y] = "O";
    }else{
      System.out.println("Cannot make that move!");
    }
  }

//Start the board with - as empty spaces
  public void startBoard(int length){
    GameRunner.changeGameStatus("PLAY");
    board = new String[length][length];
    for(int i = 0; i < length; i++){
      for(int j = 0; j < length; j++){
        board[i][j] = "-";
      }
    }
  }

//Check if the board is full or not
  public void isFull(){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[i].length; j++){
        if(board[i][j] == "-"){
          GameRunner.changeGameStatus("PLAY");
        }else{
          GameRunner.changeGameStatus("DRAW");
        }
      }
    }
  }

//returns the board in the string form
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
