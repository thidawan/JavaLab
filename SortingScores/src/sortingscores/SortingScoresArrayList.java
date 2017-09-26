/*
 * This prorame is to sort data e.g. scores from a text file.
 * Algorithm:
    1) Reading data score from a text file into Arraylist/Collection
    2) Sorting data using Collection.sort (small to large and also from large to small)
    3) Displaying the sorted data or writing to another text file
 */
package sortingscores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TEE
 */
public class SortingScoresArrayList {
    private final ArrayList<Integer> scores= new ArrayList<>();
             
    /**reads students' scores from a text file. 
     * @param fName input file name of scores
     * @throws java.io.FileNotFoundException
     */        
    public void readScoreFromTextFile(String fName) throws FileNotFoundException {
        try (Scanner fIn = new Scanner(new FileReader(fName))) {
            do{
                scores.add(fIn.nextInt());
            }while(fIn.hasNextInt());
        }
    }
    
    /**sorts scores from small to large.
     * 
     */
    public void sortScoresAtoZ(){
        Collections.sort(scores);
    }
    
    /**sorts scores from large to small.
     * 
     */
    public void sortScoresZtoA(){
        Collections.sort(scores, Collections.reverseOrder());      
    }        
    
    /**displays scores.
     * 
     */
    public void printScores(){   
        System.out.println("----------------");
        System.out.println("Indexes\tScores");
        System.out.println("----------------");
        for (int i=0; i<scores.size(); i++) {
            System.out.println("["+i+" ]\t" +scores.get(i));
        }
                
        //for (Integer score : scores) {
        //    System.out.println(score);
        //}
    }
    
    /**writes scores into a text file
     * 
     * @param f output file name 
     * @throws FileNotFoundException 
     */
    public void writeScore(String f) throws FileNotFoundException {
        try (PrintWriter fOut = new PrintWriter(f)) {
            for (Integer score : scores) {
                fOut.println(score);
            }
        }
    } 
    
    public ArrayList<Integer> getScores(){
        return new ArrayList<>(scores);
    }
    
    public int getNscores(){
        return scores.size();
    }
       
}
