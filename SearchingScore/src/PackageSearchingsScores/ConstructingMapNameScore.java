/*
 * This prorame is to search students' scores 
 * Algorithm:
    1) Reading data score from a text file into HashMap
    2) Searching student's scoe by entry their name 
    3) Displaying the score 
 */
package PackageSearchingsScores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TEE
 */
public class ConstructingMapNameScore {
    
    private final HashMap<String, Integer> nameScore = new HashMap<>(); 
                           
    public void inputNameScore(String fName) throws FileNotFoundException {
        Scanner fIn = new Scanner(new FileReader(fName));
        do {
            nameScore.put(fIn.next(), fIn.nextInt());
        } while (fIn.hasNext());
    }
        
    public void inputNameScore(String n, Integer s) {        
        nameScore.put(n, s);       
    }
         
    public HashMap<String, Integer> getNameScore(){
        return new HashMap<>(nameScore);
    }
    
    /**displays names and scores of students from hashmap.
     * 
     */
    public void printNameScoreMap() {
        Iterator< Map.Entry<String, Integer>> itr = nameScore.entrySet().iterator();
        
        System.out.println("\n---------------------");
        System.out.println("Names\tScores");
        System.out.println  ("---------------------");
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entryC = itr.next();
            System.out.println(entryC.getKey() + " \t " + entryC.getValue());
        }
    }

    /**
     * writes names-scores containing sets of student's names and scores from
     * map into text file.
     *
     * @param file is an output cluster text file.
     * @throws java.io.FileNotFoundException
     */
    public void writeNameScoreMapToTextFile(String file) throws FileNotFoundException {
        Iterator< Map.Entry<String, Integer>> itr = nameScore.entrySet().iterator();
        PrintWriter fOut = new PrintWriter(new PrintWriter(file));
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entryC = itr.next();
            fOut.println(entryC.getKey() + "  " + entryC.getValue());
        }
        fOut.close();
    }
        
}
