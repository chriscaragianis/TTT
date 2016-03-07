import java.util.*;
class GameRunner{

  public static void checkForWin(String winner){
    Board b = new Board();
    for(int i = 0; i < 3; i++){
      if((b.board[i][0]) == winner &&
        (b.board[i][1] == winner) &&
        (b.board[i][2] == winner)){
          System.out.println(winner + " Wins!");
      }

      else if(b.board[0][i] == winner &&
        b.board[1][i] == winner &&
        b.board[2][i] == winner){
          System.out.println(winner + " Wins!");
      }
    }

    if(b.board[0][0] == winner &&
      b.board[1][1] == winner &&
      b.board[2][2] == winner){
        System.out.println(winner + " Wins!");
    }

    else if(b.board[2][0] == winner && b.board[1][1] == winner &&
      b.board[0][2] == winner){
        System.out.println(winner + " Wins!");
    }
}

  public static void main(String[] args) {
    Board myBoard = new Board();
    myBoard.startBoard(3);
    myBoard.printBoard();
    System.out.println(myBoard.isFull());

    checkForWin("X");
  }
}
