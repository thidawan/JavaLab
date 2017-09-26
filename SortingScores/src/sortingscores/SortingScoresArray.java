/*
 * This prorame is to sort data e.g. scores from a text file.
 * Algorithm:
    1) Reading data score from a text file into Array
    2) Sorting data using Array.sort by ascending score then name
    3) Displaying the sorted data or writing to another text file
 */
package sortingscores;

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
    private int[] scores= new int[7];       
                
    /**reads students' scores from a text file. 
     * @param fName input file name of scores
     * @throws java.io.FileNotFoundException
     */        
    public void readScoreFromTextFile(String fName) throws FileNotFoundException {
        try (Scanner fIn = new Scanner(new FileReader(fName))) {
            int i=0;
            do{
                scores[i]=fIn.nextInt();
                i++;
            }while (fIn.hasNext());
        }
    }
    
    /**sorts scores from small to large.
     * 
     */
    public void sortScoresAtoZ(){
        Arrays.sort(scores);
    }
             
    /**sorts scores from large to small.
     * 
     */
    public void sortScoresZtoA(){
        int[] rScores= new int[7]; 
        Arrays.sort(scores);//first, sorting scores from small to large
        for (int i=0; i<scores.length; i++) { //sorting the array of scores
            rScores[i] = scores[scores.length - 1 - i];
        }        
        scores = Arrays.copyOf(rScores, rScores.length);        
    }
        
    /**displays scores.
     * 
     */
    public void printScores(){ 
        System.out.println("----------------");
        System.out.println("Indexes\tScores");
        System.out.println("----------------");
        for(int i=0; i<scores.length; i++){
               System.out.println("["+i+" ]\t" +scores[i]);           
        }
    }
    
    /**writes scores into a text file
     * 
     * @param f output file name 
     * @throws FileNotFoundException 
     */
    public void writeScore(String f) throws FileNotFoundException {
        try (PrintWriter fOut = new PrintWriter(f)) {
            for(int i=0; i<scores.length ; i++){
                fOut.println(scores[i]);
            }
        }
    } 
    
    /**gets an output array of scores.
     * 
     * @return an output array of scores 
     */
    public int[] getScores(){
        return scores;
    }
    
    /**gets an output size of the array of scores.
     * 
     * @return size of the output array of scores 
     */
    public int getNscores(){
        return scores.length;
    }
        
}
