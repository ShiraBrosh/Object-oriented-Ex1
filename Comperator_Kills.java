import java.util.Comparator;

public class Comperator_Kills  implements Comparator<ConcretePiece> {
    @Override

    public int compare(ConcretePiece piece1, ConcretePiece piece2) {

        int nameP1 = Integer.parseInt(piece1.getName().substring(1));
        int nameP2 = Integer.parseInt(piece2.getName().substring(1));

        if (piece1.getKills() > piece2.getKills()) {
            return -1;
        } else {
            if (piece1.getKills() < piece2.getKills()) {
                return 1;
            } else {
                if (nameP1 > nameP2)
                    return 1;
                else {
                    if (nameP1 < nameP2) {
                        return -1;
                    } else {
                        if (piece1.getOwner().isPlayerOne() != GameLogic.theWinnerIsPlayerOne)
                            return -1;
                        else
                            return 1;
                    }
                }
            }
        }
    }
}