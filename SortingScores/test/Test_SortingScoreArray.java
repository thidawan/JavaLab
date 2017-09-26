/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import org.junit.Test;
import sortingscores.SortingScoresArrayList;

/**
 *
 * @author TEE
 */
public class Test_SortingScoreArray {
    
    public Test_SortingScoreArray() {
    }
    
    
       /*
 * This prorame is to test sorting data e.g. scores from a text file.
 * Algorithm:
    1) Reading data score from a text file into Arraylist/Collection
    2) Sorting data using Collection.sort (small to large and also from large to small)
    3) Displaying the sorted data or writing to another text file
 */
    @Test
    public void mainTesting() throws FileNotFoundException {
    
        SortingScoresArrayList J = new SortingScoresArrayList();//calling sorting class
        J.readScoreFromTextFile("Scores.txt"); //1) Reading data score from a text file into Arraylist/Collection
        System.out.println("Original Scores:");
        J.printScores();//display the array list of scored 
        System.out.println("N students score = "+J.getNscores());
      
        J.sortScoresAtoZ();//2) Sorting data using Collection.sort (small to large)
        System.out.println("\nSorted Scores from Small to Large:");
        J.printScores();//3) Displaying the sorted data
        J.writeScore("SortedScoreAtoZ.txt");//3) Writing the sorted data into another text file
    
        J.sortScoresZtoA();//2) Sorting array data from large to small 
        System.out.println("\nSorted Scores from Large to Samll:");
        J.printScores();//3) Displaying the sorted data
        J.writeScore("SortedScoreZtoA.txt");//3) Writing the sorted data into another text file
    }
}
