package PackageSortingNamesScores;

/**
 *
 * @author Tee
 */
public class PairNameScore {
    public String name;//student's name 
    public int score;//Studen's score    

    public PairNameScore(String n, int s) {
        this.name = n;
        this.score = s;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
