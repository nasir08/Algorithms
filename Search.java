/**
 Consider LA is a linear array with N elements and K is a positive integer such that K<=N.
 Write a program for the algorithm to find an element with a value of ITEM using sequential search.
 */

/**
 * Created by nasir on 27/09/2016.
 */

package Array;

import java.util.Arrays;

public class Search {

    public static void main(String[] args)
    {
        int[] LA = {1,3,5,7,8};
        int ITEM = 5;
        int N = 5;
        int j = 1;
        int i;

        System.out.println("Array: "+Arrays.toString(LA));

        //traverse the array and compare elements with utem
        for(i=0; i<N; i++)
        {
            if(LA[i] == ITEM)
            {
                break;
            }
            j++;
        }
        System.out.println("Found element "+ITEM+" at position "+j);
    }
}
