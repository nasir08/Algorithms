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
                if(counter == 3)
                {
                    counter=0;
                    newS +="-";
                }
                newS += arr[i];
                counter++;
            }
        }
        return newS;
    }

    public static void main(String [] args)
    {
        String S = "4-         5647-----8536-754";
        System.out.println(solution(S));
    }
}
