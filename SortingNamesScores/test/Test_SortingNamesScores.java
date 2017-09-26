
import java.io.FileNotFoundException;
import org.junit.Test;
import PackageSortingNamesScores.SortingScoresArray;

/**
 *
 * @author TEE
 */
public class Test_SortingNamesScores {

    public Test_SortingNamesScores() {
    }

    /*
     * This prorame is to sort students' data e.g. names and their scores from a text file.
     * Algorithm:
     1) Reading data score from a text file into Array
     2) Sorting data using Array.sort by ascending score then name
     3) Displaying the sorted data or writing to another text file
     */
    @Test
    public void mainTesting() throws FileNotFoundException {

        SortingScoresArray J = new SortingScoresArray();
        J.readNameScoreFromTextFile("NameScore.txt");//1) Reading data score from a text file into Array
        System.out.println("Original Names and Scores:");
        J.printNamesScores();
        System.out.println("Number of Students = " + J.getNscores());
      
        /*Sorting ascending by Score*/
        J.sortingNameScoreByScoreAtoZ(J.getNames(), J.getScores());//2) Sorting data using Array.sort by ascending score then name
        System.out.println("\nSorted Ascending by Scores:");
        J.printNamesScores();//3) Displaying the sorted data
        J.writeNamesScoresToTextFile("SortedByScoreAtoZ.txt");//3) Writing the sorted data into another text file

        /*Sorting ascending by Name*/
        J.sortingNameScoreByNameAtoZ(J.getNames(), J.getScores());//2) Sorting data using Array.sort by ascending score then name
        System.out.println("\nSorted Ascending by Names:");
        J.printNamesScores();//3) Displaying the sorted data
        J.writeNamesScoresToTextFile("SortedByNameAtoZ.txt");//3) Writing the sorted data into another text file
        
    }
}
