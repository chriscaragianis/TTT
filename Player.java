import java.util.Random;
class Player{
  private String player1;
  private String player2;
  Board b = new Board();

  public void setPlayerNames(String firstPlayer, String secondPlayer){
    player1 = firstPlayer;
    player2 = secondPlayer;
  }

  public int whoIsFirst(){
    Random random = new Random();
    int  n = random.nextInt(2) + 1;
    System.out.println("Looks like player " + n + " is going first!");
    return n;
  }

  public void makeMove(String playerName, int xPos, int yPos){
    b.setBoard(playerName, xPos, yPos);
  }
}
