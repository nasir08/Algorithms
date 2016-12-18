package Array;

import java.util.Arrays;

/**
 * Created by nasir on 18/12/2016.
 */
public class Fibonacci {
    public static int fibonacci(int A)
    {
        int res;
        if(A == 0){ res = 0; }
        else if(A == 1){ res = 1; }
        else
        {
            res = fibonacci(A-1) + fibonacci(A-2);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Numbers: "+ Arrays.toString(arr));
        for(int i =0; i<arr.length; i++)
        {
           arr[i] = fibonacci(arr[i]);
        }
        System.out.println("Fibonacci: "+ Arrays.toString(arr));
    }
}
