package Array;

import java.util.Scanner;

/**
 * Created by nasir on 21/12/2016.
 */
public class AngryProfessorProblem {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();

        for(int i = 0; i < t; i++)
        {
            int n = inp.nextInt();
            int k = inp.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<n; j++)
            {
                arr[j] = inp.nextInt();
            }
            System.out.println(check(arr,k));
        }
    }

    public static String check(int[] arr, int threshold)
    {
        int passNumber = 0;
        for(int c : arr)
        {
            if(c<=0)
            {
                passNumber++;
            }
        }
        if(passNumber>=threshold) { return "NO"; }
        else { return "YES"; }
    }
}


/*
A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format:

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N(students in the class) and K(the cancelation threshold). The second line contains N space-separated integers describing the arrival times for each student.

Note: Non-positive arrival times indicate the student arrived early or on time; positive arrival times indicate the student arrived  minutes late.


Output Format:

For each test case, print the word YES if the class is canceled or NO if it is not.

Note
If a student arrives exactly on time, the student is considered to have entered before the class started.

Sample Input:

2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output:
YES
NO
 */

