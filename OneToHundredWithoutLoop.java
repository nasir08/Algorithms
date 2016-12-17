/**
 * Created by nasir on 17/12/2016.
 */
public class OneToHundredWithoutLoop {
    public static void print(int num)
    {
        if(num >= 1 && num <=100)
        {
            System.out.println(num++);
            print(num);
        }
    }

    public static void main(String[] args)
    {
        print(1);
    }
}
