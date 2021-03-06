/**
 * Created by nasir on 14/02/2017.
 */
import java.util.Scanner;
public class Substring
{
    public static String solution(String firstString, String secondString)
    {
        String str1 = firstString.toLowerCase();
        String str2 = secondString.toLowerCase();
        str1 = str1.trim();
        str2 = str2.trim();
        String msg = "";
        if ((str1.length() == 0) || (str2.length() == 0))
        {
            msg = "No substring found!";
        }
        else
        {
            for (int i = 0; i < str1.length(); i++)
            {
                if ((str1.length() - i) >= str2.length())
                {
                    String newStr = str1.substring(i, (i + str2.length()));
                    if (str2.equals(newStr))
                    {
                        msg = "Substring Found!";
                        break;
                    }
                }
                else
                {
                    msg = "No substring found!";
                    break;
                }
            }
        }
        return msg;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter second string: ");
        String secondString = input.nextLine();
        System.out.println(solution(firstString,secondString));
    }
}
