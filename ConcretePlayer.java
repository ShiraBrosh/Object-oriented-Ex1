
public class ConcretePlayer implements Player{

    private boolean isDefender;
    private int wins;
    public ConcretePlayer (boolean defender){
        this.isDefender = defender;
        this.wins = 0;
    }

    public ConcretePlayer(){
        this.wins =0;
    }
    public boolean isPlayerOne(){
        if (!isDefender)
            return true;
        return false;
    }

    public int getWins(){
        return this.wins;
    }

    public void updateWins(){
        this.wins++;
    }

    public String getType(){
        if(isDefender){
            return "defender";
        }
        return "attacker";
    }

}

