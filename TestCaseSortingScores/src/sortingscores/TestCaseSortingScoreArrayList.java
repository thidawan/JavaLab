
package sortingscores;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author TEE
 */
public class TestCaseSortingScoreArrayList {
    private final ArrayList<Integer> ans= new ArrayList<>();
    private ArrayList<Integer> score= new ArrayList<>();
    
    /**
     * 
     * @param S object class-Sorting scores (ArrayList)
     * @param fName file name of expecting answer in text file
     * @throws FileNotFoundException 
     */
    public void get2ArrayLists(SortingScoresArrayList S, String fName) throws FileNotFoundException{           
        S.readScoreFromTextFile("Scores.txt"); //1) Reading data score from a text file into Arraylist/Collection
        System.out.println("Original Scores:");
        S.printScores();//display the array list of scored 
        S.sortScoresAtoZ();//2) Sorting data using Collection.sort (small to large)
        System.out.println("\nSorted Scores:");
        S.printScores();//3) Displaying the sorted data
        
      /*Reading expected output*/  
        score= S.getScores();
        Scanner fIn = new Scanner(new FileReader(fName));//reads students' scores from a text file. 
        do{
                ans.add(fIn.nextInt());
        }while(fIn.hasNextInt());
                     
    }
    
    public Boolean comparing2ArrayLists(){
        Boolean test = true;
        System.out.println("\nComparison of the Two ArrayLists");
        System.out.println("------------------------------");
        System.out.println("Indexes\tScores\tExpectedScores");
        System.out.println("------------------------------");
        for(int i=0; i<score.size(); i++){
            if(Objects.equals(score.get(i), ans.get(i))){
                System.out.println("[" + i +"] "+score.get(i)+"="+ans.get(i));
            } else {
                System.out.println("[" + i +"] "+score.get(i)+" != "+ans.get(i));
                test = false;
            }
        }
        return test;
    }        
      
}    
    

