import java.util.Random;
import java.util.HashMap;

class Prs {
  public static void main(String args[]) {

    // n beats n+1.  last beats first.
    String[] options = { "rock", "scissors", "paper" };

    // easy enough to concatenate possible pairs into one index
    // removing the need for nested hashmaps

    HashMap<String, String> outcomes = new HashMap<String, String>();
    outcomes.put("rockscissors", "Rock Wins!");
    outcomes.put("rockpaper", "Rock Loses!");
    outcomes.put("rockrock", "Rock Ties!");
    outcomes.put("scissorsrock", "Scissors Lose!");
    outcomes.put("scissorspaper", "Scissors Win!");
    outcomes.put("scissorsscissors", "Scissors Tie!");
    outcomes.put("paperrock", "Paper Wins!");
    outcomes.put("paperpaper", "Paper Ties!");
    outcomes.put("paperscissors", "Paper Loses!");

    Random r = new Random();
    int rc = r.nextInt(options.size()); // computer random value
    int ru = r.nextInt(options.size()); // user random value

    System.out.println("Would you like to play a game?");

    System.out.println("Computer Chose " + options[rc]);
    System.out.println("You Chose " + options[ru]);

    String result = options[ru] + options[rc];
    System.out.println(outcomes.get(result));

  }
}

/* nested maps in java terrible.
/* turns out i don't need this */

class InnerHashMap {
  private HashMap<String, String> opponent;

  public InnerHashMap() {
    opponent = new HashMap<String, String>();
  }

  public HashMap put(String k, String v) {
    opponent.put(k, v);
    return opponent;
  }

  public String get(String k){
    return opponent.get(k);
  }
}
