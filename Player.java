import java.util.Random;
class Player{
  private String player1;
  private String player2;

  public String getPlayer1(){
    return player1;
  }

  public String getPlayer2(){
    return player2;
  }

  public void setPlayerNames(String firstPlayer, String secondPlayer){
    player1 = firstPlayer;
    player2 = secondPlayer;
  }

  public int whoIsFirst(){
    Random random = new Random();
    String goingFirst;
    int  n = random.nextInt(2) + 1;
    if(n == 1){
      goingFirst = player1;
    }else{
      goingFirst = player2;
    }
    System.out.println("Looks like " + goingFirst + " is X and going first!");
    return n;
  }
}
