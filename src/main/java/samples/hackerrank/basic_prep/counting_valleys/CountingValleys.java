package samples.hackerrank.basic_prep.counting_valleys;

import java.util.Arrays;
import java.util.List;

//An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
//
//A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
//
//Example
//
//
//
//The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
//
//Function Description
//
//Complete the countingValleys function in the editor below.
//
//countingValleys has the following parameter(s):
//
//int steps: the number of steps on the hike
//string path: a string describing the path
//Returns
//
//int: the number of valleys traversed
//Input Format
//
//The first line contains an integer , the number of steps in the hike.
//The second line contains a single string , of  characters that describe the path.
//
//Constraints
//
//Sample Input
//
//8
//UDDDUDUU
//Sample Output
//
//1
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here

        if (steps < 1 || steps > 10_000_000) {
            return -1;
        }

        int currLevel = 0;
        int totalValleys = 0;
        boolean inValley = false;

        for (char c : path.toCharArray()) {
            currLevel = currLevel + addLevel(c);

            if (currLevel < 0 && !inValley) {
                totalValleys++;
                inValley = true;
            } else if ( currLevel >= 0 && inValley) {
                inValley = false;
            }
        }

        return totalValleys;
    }

    private static int addLevel(char c) {
        if (c == 'U') {
            return 1;
        } else if(c == 'D') {
            return -1;
        } else {
            return 0;
            // throw exception;
        }
    }

}
