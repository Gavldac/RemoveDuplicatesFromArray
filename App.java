import java.util.Arrays;

/**
 * @author LeetCode challenge 26.
 * @author Test client by Edwin Casady
 * @author Solution by
 */
public class App {

    /*
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only
     * once.
     * The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     * 
     * The remaining elements of the array are not important as well as the size of
     * the array.
     * 
     * return k (the number of unique elements)
     */

    /**
     * Removes duplicated values from an int[] and returns the number k of unique elements.
     * Note: the array is modified to preserve order of a sorted array but will not be resized.
     * The array will likely have corrupt data after the last unique value. 
     * @param nums []
     * @return int k - the number of unique elements
     */

    private static int removeDuplicates(int[] nums) {
        return 0; // TODO
    }

    ///////////////////////////// TEST CLIENT///////////////////////////////////////

    public static void main(String[] args) throws Exception {

        int[] test1 = { 1, 1, 2 };
        int k1 = removeDuplicates(test1);
        System.out.println("test1");
        System.out.println("Expected: [1, 2, _] k: " + 2);
        System.out.println("Results:  " + Arrays.toString(test1) + " k: " + k1);

        int[] test2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = removeDuplicates(test2);
        System.out.println("test2");
        System.out.println("Expected: [0, 1, 2, 3, 4, _, _, _, _, _] k: " + 5);
        System.out.println("Results:  " + Arrays.toString(test2) + " k: " + k2);

    }
}
