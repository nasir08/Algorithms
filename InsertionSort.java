package Array;

import java.util.Arrays;

/**
 * Created by nasir on 12/12/2016.
 */
public class InsertionSort {
    public static void main(String[] args)
    {
        int[] A = {504,233,743,1004,20,834,84757};
        int key;

        for(int i=1; i<A.length; i++)
        {
            key = A[i];
            int j = i-1;
            while(j>= 0 && A[j] > key)
            {
                A[j+1] = A[j];
                A[j] = key;
                j--;
            }
        }
        System.out.println(Arrays.toString(A));
    }

}
