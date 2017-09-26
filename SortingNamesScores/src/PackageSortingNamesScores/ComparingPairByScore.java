package PackageSortingNamesScores;
import java.util.Comparator;

/**
 *
 * @author Tee
 */
public class ComparingPairByScore implements Comparator<PairNameScore>{
    
     /**sorts two pairs by core and following by name ASC. (Dual-Pivot Quick Sort) .
     *If pair > pair2 then return 1  (either P1.name> P2.name or P1.score>P2.score when P1.name=P2.name)
     *If pair1 = pair2 then return 0 
     *If pair1 < pair2 then return -1 (either P1.name< P2.name or P1.score<P2.score when P1.name=P2.name)     
     @param P1 input first pair 
     @param P2 input second pair 
     * @return 0=same, 1=greater or -1=less
     */
    @Override
    public int compare(PairNameScore P1, PairNameScore P2) {                    
            if(P1.score==P2.score){            
                return P1.name.compareTo (P2.name);
            }            
            return new Integer(P1.score).compareTo(P2.score);
    }    
}

