package Array;

import java.util.*;
import java.io.*;

/**
 * Created by nasir on 08/12/2016.
 */
public class PhoneNumber {
    public static String solution(String S) {
        // write your code in Java SE 8

        S = S.replace('-', ' ');
        String newS ="";
        int counter=0;
        String[] arr = S.split("");
        for(int i = 0; i<arr.length; i++)
        {
            if(!arr[i].trim().equals(""))
            {
                newS += arr[i];
                counter++;
                if(counter == 3)
                {
                    counter=0;
                    newS +="-";
                }
            }
        }
        return newS;
    }

    public static void main(String [] args)
    {
        String S = "456478536754";
        System.out.println(solution(S));
    }
}
