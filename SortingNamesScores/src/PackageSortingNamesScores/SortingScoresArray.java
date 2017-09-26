/*
 * This prorame is to sort students' data e.g. names and their scores from a text file.
 * Algorithm:
    1) Reading data score from a text file into Array
    2) Sorting data using Array.sort by ascending score then name
    3) Displaying the sorted data or writing to another text file
 */
package PackageSortingNamesScores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TEE
 */
public class SortingScoresArray {
    private final String[] names= new String[7];
    private final int[] scores= new int[7];
                
    /**reads students' names and scores from a text file. 
     * @param fName input file name of scores
     * @throws java.io.FileNotFoundException
     */        
    public void readNameScoreFromTextFile(String fName) throws FileNotFoundException {
        try (Scanner fIn = new Scanner(new FileReader(fName))) {
            int i=0;
            do{
                names[i] = fIn.next();
                scores[i]= fIn.nextInt();
                i++;
            }while (fIn.hasNext());
        }
    }

    /**sorts 2 columns of students' names and scores by scores from small to large.
     * 
     * @param nList a list of students' names
     * @param sList a list of students' scores
     */
    public void sortingNameScoreByScoreAtoZ(String[] nList, int[] sList) {
        PairNameScore[] pairs = new PairNameScore[sList.length];//declear pairs object of names and scores
        for (int p = 0; p < sList.length; p++) 
            pairs[p] = new PairNameScore(nList[p], sList[p]); //inputing object pairs ofname and score pairs           
        
        Arrays.sort(pairs, new ComparingPairByScore());//sorting ascending the object pairs by the scores
        
        for (int p = 0; p < nList.length; p++) {//output of the sorted edges
            nList[p] = pairs[p].name;
            sList[p] = pairs[p].score;
        }
    }
    
    /**sorts 2 columns of students' names and scores by scores from small to large.
     * 
     * @param nList a list of students' names
     * @param sList a list of students' scores
     */
    public void sortingNameScoreByNameAtoZ(String[] nList, int[] sList) {
        PairNameScore[] pairs = new PairNameScore[nList.length];
        for (int p = 0; p < nList.length; p++) //inputing name and score pairs from the name and score lists
            pairs[p] = new PairNameScore(nList[p], sList[p]);            
        
        Arrays.sort(pairs, new ComparingPairByName());     
        
        for (int p = 0; p < nList.length; p++) {//output of the sorted edges
            nList[p] = pairs[p].name;
            sList[p] = pairs[p].score;
        }
    }
    
    /**displays names and scores of students.
     * 
     */
    public void printNamesScores(){        
        System.out.println("--------------------------");
        System.out.println("Names\t\tScores");
        System.out.println("--------------------------");        
        for(int i=0; i<scores.length; i++){
           System.out.println(names[i]+"\t\t"+scores[i]);
        }
    }
    
    /**writes scores into a text file
     * 
     * @param f output file name 
     * @throws FileNotFoundException 
     */
    public void writeNamesScoresToTextFile(String f) throws FileNotFoundException {
        PrintWriter fOut = new PrintWriter(f);
        for(int i=0; i<scores.length ; i++){
           fOut.println(names[i]+"\t"+scores[i]);
        }            
        fOut.close();
    } 
    
    /**gets an output array of scores.
     * 
     * @return an output array of scores 
     */
    public int[] getScores(){
        return scores;
    }
    
    /**gets an output array of scores.
     * 
     * @return an output array of scores 
     */
    public String[] getNames(){
        return names;
    }
    
    /**gets an output size of the array of scores.
     * 
     * @return size of the output array of scores 
     */
    public int getNscores(){
        return scores.length;
    }
        
}
