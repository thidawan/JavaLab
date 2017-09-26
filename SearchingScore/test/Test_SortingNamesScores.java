
import java.io.FileNotFoundException;
import org.junit.Test;
import PackageSearchingsScores.ConstructingMapNameScore;
import PackageSearchingsScores.SearchingNameForScore;

/**
 *
 * @author TEE
 */
public class Test_SortingNamesScores {

    public Test_SortingNamesScores() {
    }

    /*
     * This prorame is to search for students' score for a given name
     * Algorithm:
     1) Reading data score from a text file into Array
     2) Sorting data using Array.sort by ascending score then name
     3) Displaying the sorted data or writing to another text file
     */
    @Test
    public void mainTesting() throws FileNotFoundException {

        ConstructingMapNameScore J = new ConstructingMapNameScore();
        J.readNameScoreFromTextFile("NameScore.txt");//1) Reading data score from a text file into Array
        System.out.println("Original Names and Scores:");
        J.printNameScoreMap();
        System.out.println("--Total Students = " + J.getNameScore().size()+"--");
      
       /*Searching for studen't score from a given name*/
        SearchingNameForScore S = new SearchingNameForScore();
        S.searchStudentScore(J, "Virat");
    }
}
