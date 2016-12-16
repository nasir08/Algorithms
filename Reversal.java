package Array;

/**
 * Created by nasir on 09/11/2016.
 */
import java.io.*;
import java.util.*;
import java.lang.*;

public class Reversal {

    public static int[] reverse(int[] arr, int n)
    {
        int counter = 0;
        int i = 0;
        int j = arr.length - 1;
        double steps = Math.ceil(n/2);
        while(counter != steps)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            counter++;
            i++;
            j--;
        }
        return arr;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] STDIN = new int[size];
        for(int i=0; 1<size; i++)
        {
            STDIN[i] = input.nextInt();
        }
        int[] STDOUT = reverse(STDIN,size);
        System.out.println(STDOUT);
    }
}