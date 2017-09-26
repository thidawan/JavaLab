/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import org.junit.Test;
import sortingscores.SortingScoresArrayList;
import sortingscores.TestCaseSortingScoreArrayList;

/**
 *
 * @author TEE
 */
public class Test_CaseSortingScores2Arrays {
    
    public Test_CaseSortingScores2Arrays() {
    }
    
    
    @Test
    public void testCase() throws FileNotFoundException {
        SortingScoresArrayList  S = new SortingScoresArrayList();
        TestCaseSortingScoreArrayList T = new TestCaseSortingScoreArrayList();
        
        T.get2ArrayLists(S, "AnswerScores.txt");
        System.out.println(T.comparing2ArrayLists());
    }
}























