import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import jdk.jshell.execution.Util;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void test() {
        // DEFINE EACH TEST CASE AS A SEPARATE FUNCTION
        // CALL ALL TEST FUNCTIONS HERE
        testOne();
        testTwo();
        testThree();
        testFour();
        testFive();
        testSix();
        testSeven();
    }

    public void testOne(){
        String testDescription = "tests if the output of sort() is sorted";
        int[] testArray = new int[]{8, 1, 7, 2, 6, 2, 5, 3};
        try{
            assertTrue(Utils.is_sorted(MergeSort.sort(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    public void testTwo(){
        String testDescription = "tests if the output of sort_in_place() is sorted";
        int[] testArray = new int[]{8, 1, 7, 2, 6, 2, 5, 3};
        try{
            assertTrue(Utils.is_sorted(MergeSort.sort_in_place(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    public void testThree(){
        String testDescription = "tests if the output of sort() is a permutation of the input list";
        int[] testArray = new int[]{8, 1, 7, 2, 6, 2, 5, 3};
        try{
            assertTrue(Utils.is_permutation(Utils.array_to_list(testArray), MergeSort.sort(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    public void testFour(){
        String testDescription = "tests if the output of sort_in_place() is a permutation of the input list";
        int[] testArray = new int[]{8, 1, 7, 2, 6, 2, 5, 3};
        try{
            assertTrue(Utils.is_permutation(Utils.array_to_list(testArray), MergeSort.sort_in_place(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    public void testFive(){
        String testDescription = "tests if output of sort() is actually a new list";
        int[] testArray = new int[]{8, 1, 7, 2, 6, 2, 5, 3};
        Node testNode = Utils.array_to_list(testArray);
        try{
            assertFalse(Utils.equals(testNode, MergeSort.sort(testNode)));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }


    public void testSix(){
        String testDescription = "tests for corner cases?";
        int[] testArray = new int[]{};
        try{
            assertTrue(Utils.is_sorted(MergeSort.sort(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }

    public void testSeven(){
        String testDescription = "tests for corner cases?";
        int[] testArray = new int[]{};
        try{
            assertTrue(Utils.is_sorted(MergeSort.sort_in_place(Utils.array_to_list(testArray))));
        }
        catch (Exception e){
            fail(testDescription + e.toString());
        }
    }
}
