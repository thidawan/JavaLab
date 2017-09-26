import java.io.FileNotFoundException;
import org.junit.Test;
import sortingscores.SortingScoresArrayList;

/**
 *
 * @author TEE
 */
public class Test_SortingScoreArrayList {
    
    public Test_SortingScoreArrayList() {
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
    
        SortingScoresArrayList J= new SortingScoresArrayList (); //calling sorting class
        J.readScoreFromTextFile("Scores.txt"); //1) Reading data score from a text file into Arraylist/Collection
        System.out.println("Original Scores:");
        J.printScores();//display the array list of scored 
        System.out.println("N students score = "+J.getNscores());
      
        J.sortScoresAtoZ();//2) Sorting data using Collection.sort (small to large)
        System.out.println("\nSorted Scores:");
        J.printScores();//3) Displaying the sorted data
        J.writeScore("SortedScoreAtoZ.txt");//3) Writing the sorted data into another text file
    
        J.sortScoresZtoA();//2) Sorting data using Collection.sort (from large to small)
        System.out.println("\nSorted Scores:");
        J.printScores();//3) Displaying the sorted data
        J.writeScore("SortedScoreAtoZ.txt");//3) Writing the sorted data into another text file
    }
}
