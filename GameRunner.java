import java.util.*;
class GameRunner{

  public static void checkForWin(String winner){
    Board b = new Board();
    for(int i = 0; i < 3; i++){
      if(b.getBoard(i,0) == winner &&
        (b.getBoard(i,1) == winner) &&
        (b.getBoard(i,2) == winner)){
          System.out.println(winner + " Wins!");
      }

      else if(b.getBoard(0,i) == winner &&
        b.getBoard(1,i) == winner &&
        b.getBoard(2,i) == winner){
          System.out.println(winner + " Wins!");
      }
    }

    if(b.getBoard(0,0) == winner &&
      b.getBoard(1,1) == winner &&
      b.getBoard(2,2) == winner){
        System.out.println(winner + " Wins!");
    }

    else if(b.getBoard(2,0) == winner && b.getBoard(1,1) == winner &&
      b.getBoard(0,2) == winner){
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
