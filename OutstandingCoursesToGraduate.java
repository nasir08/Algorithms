package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nasir on 16/12/2016.
 */
public class OutstandingCoursesToGraduate {
    public static List solution1(List taken, List requiredToTake) {
        int counter = 0;
        if (taken.size() == 0) {
            return requiredToTake;
        } else {
            List outStandingCourses = new ArrayList();
            for (int i = 0; i < requiredToTake.size(); i++) {
                if (!taken.contains(requiredToTake.get(i))) {
                    outStandingCourses.add(counter, requiredToTake.get(i));
                    counter++;
                }
            }
            return outStandingCourses;
        }
    }


    public static List solution2(List taken, List requiredToTake)
    {
        if (taken.size() == 0) {
            return requiredToTake;
        } else {
            List outStandingCourses = new ArrayList(requiredToTake);
            outStandingCourses.removeAll(taken);
            return outStandingCourses;
        }
    }

    public static void main(String[] args)
    {
        List taken = new ArrayList();
        List requiredToTake = new ArrayList();
        taken.add(0,"SOEN 6481"); taken.add(1,"SOEN 6461"); taken.add(2,"SOEN 6491"); taken.add(3,"SOEN 6431");

        requiredToTake.add(0,"SOEN 6481"); requiredToTake.add(1,"INSE 6260"); requiredToTake.add(2,"SOEN 6611"); requiredToTake.add(3,"SOEN 6431");
        requiredToTake.add(4,"SOEN 6461"); requiredToTake.add(5,"SOEN 6491"); requiredToTake.add(6,"SOEN 691");
        System.out.println(solution1(taken,requiredToTake));
        System.out.println(solution2(taken,requiredToTake));
    }
}
