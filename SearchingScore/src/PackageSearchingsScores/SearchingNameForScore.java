/*
 * This prorame is to search students' scores 
 * Algorithm:
 1) Reading data score from a text file into HashMap
 2) Searching student's scoe by entry their name 
 3) Displaying the score 
 */
package PackageSearchingsScores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * @author TEE
 */
public class SearchingNameForScore {

    /**
     * searches for students' score in the constructed hashmap by a given
     * student's name.
     *
     * @param S hasmap contraining names and scores
     * @param name input file name of scores
     */
    public void searchStudentScore(ConstructingMapNameScore S, String name) {        
        Iterator< Entry<ArrayList<String>, Integer>> itrC = S.getNameScore().entrySet().iterator();        
        while (itrC.hasNext()) {
            Entry<ArrayList<String>, Integer> entryN = itrC.next();
            if (entryN.getKey().contains(name)) {
                System.out.println("\n\t" + entryN.getKey() + "  " + entryN.getValue());
            }
        }
    }

}
