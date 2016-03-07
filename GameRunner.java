class GameRunner{

  public static void main(String[] args) {
    Board myBoard = new board(3);
    myBoard.startBoard(3);
    myBoard.makeBoard();
    myBoard.printBoard();
    System.out.println(myBoard.isFull());
  }
}
