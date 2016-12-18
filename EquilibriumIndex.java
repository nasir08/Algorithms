package Array;

/**
 * Created by nasir on 08/12/2016.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EquilibriumIndex
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for(int i=0; i<n; i++)
        {
            int size = input.nextInt();
            int[] arr = new int[size];
            for(int j = 0; j<size; j++)
            {
                arr[j] = input.nextInt();
            }
            find(arr);
        }
    }

    public static void find(int[] arr) {
        BigInteger sum = BigInteger.ZERO;
        boolean found = false;
        BigInteger left, right;
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(BigInteger.valueOf(arr[i]));
        }
        right = sum;
        left = BigInteger.ZERO;
        for (int j = 0; j < arr.length; j++) {
            if(sum.equals(0))
            {
                found = true;
                break;
            }
            else if(arr.length == 1)
            {
                found = true;
                break;
            }
            else if (arr.length > 1 && j == 0) {
                right = right.subtract(BigInteger.valueOf(arr[j]));
                if (right.equals(left)) {
                    found = true;
                    break;
                }

            } else if (j > 0) {
                right = right.subtract(BigInteger.valueOf(arr[j]));
                left = left.add(BigInteger.valueOf(arr[j - 1]));
                if (right.equals(left)) {
                    found = true;
                    break;
                }
            }
        }
        if (found == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}