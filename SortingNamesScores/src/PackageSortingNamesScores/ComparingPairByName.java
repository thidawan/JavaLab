package PackageSortingNamesScores;
import java.util.Comparator;

/**
 *
 * @author Tee
 */
public class ComparingPairByName implements Comparator<PairNameScore>{
    
     /**sorts two pairs by name and following by score ASC. (Dual-Pivot Quick Sort) .
     *If edge1 > edge2 then return 1  (either E1.p> E2.p or E1.c>E2.c when E1.p=E2.p)
     *If edge1 = edge2 then return 0 
     *If edge1 < edge2 then return -1 (either E1.p< E2.p or E1.c<E2.c when E1.p=E2.p)     
     * @param P1 input first edge 
     * @param P2 input second edge 
     * @return 0=same, 1=greater or -1=less
     */
    @Override
    public int compare(PairNameScore P1, PairNameScore P2) {                    
            if(P1.name==P2.name){            
                return new Integer(P1.score).compareTo(P2.score);
            }            
            return P1.name.compareTo (P2.name);
    }    
}

