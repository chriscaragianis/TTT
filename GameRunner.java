class GameRunner{

  public void checkForWin(){
    for(int i = 0; i < board.length; i++){
      int position = 0;
      if(board[i][position] == "X" && board[i][position + 1] == "X" &&
        board[i][position + 2] == "X"){
        System.out.println("X Wins!");
      }
      else if(board[i][position] == "O" && board[i][position + 1] == "O" &&
        board[i][position + 2] == "O"){
        System.out.println("X Wins!");
      }
    }
  }

  public static void main(String[] args) {
    Board myBoard = new Board();
    myBoard.startBoard(3);
    myBoard.makeBoard();
    myBoard.printBoard();
    System.out.println(myBoard.isFull());
  }
}
