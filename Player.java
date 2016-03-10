import java.util.*;
class Player{
  private String[] players = new String[2];

  public String getPlayer(int i){
    return players[i];
  }

  public void setPlayerNames(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("First player: ");
    players[0] = userInput.next( );
    System.out.println("Second player: ");
    players[1] = userInput.next( );
  }

  public int whoIsFirst(){
    Random random = new Random();
    String goingFirst;
    String goingSecond;
    int  n = random.nextInt(2) + 1;
    if(n == 1){
      goingFirst = players[0];
      goingSecond = players[1];
    }else{
      goingFirst = players[1];
      goingSecond = players[0];
    }
    System.out.println("Looks like " + goingFirst + " is X \nand " +
      goingSecond + " is O \n" +
      goingFirst + " is going first!");
    return n;
  }
}
