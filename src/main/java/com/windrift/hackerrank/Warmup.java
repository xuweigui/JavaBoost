package com.windrift.hackerrank;

import java.util.List;

public class Warmup {

    /**
     * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,
     * step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
     *
     * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
     * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
     * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     *
     * Example
     *
     *
     *
     * The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
     *
     * Function Description
     *
     * Complete the countingValleys function in the editor below.
     *
     * countingValleys has the following parameter(s):
     *
     * int steps: the number of steps on the hike
     * string path: a string describing the path
     * Returns
     *
     * int: the number of valleys traversed
     * @param steps
     * @param path
     * @return
     */
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int nv = 0;
        int level = 0;
        for (int i=0; i<steps; i++) {
            char c = path.charAt(i);
            if ('D' == c) {
                level--;
            } else {
                level++;
                if (level == 0) {
                    nv++;
                }
            }
        }
        return nv;
    }

    /**
     * There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus
     * cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will
     * take to jump from the starting postion to the last cloud. It is always possible to win the game.
     *
     * For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
     *
     * Example
     *
     * Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices  and . They could follow these two paths:  or .
     * The first path takes  jumps while the second takes . Return .
     *
     * Function Description
     *
     * Complete the jumpingOnClouds function in the editor below.
     *
     * jumpingOnClouds has the following parameter(s):
     *
     * int c[n]: an array of binary integers
     * Returns
     *
     * int: the minimum number of jumps required
     * @param c
     * @return
     */
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        if (c.size() == 1) {
            return 0;
        }
        if (c.size() == 2) {
            return (c.get(1) == 1)? 0 : 1;
        }
        if (c.get(2) == 1) {
            return 1 + jumpingOnClouds(c.subList(1, c.size()));
        } else {
            return 1 + jumpingOnClouds(c.subList(2, c.size()));
        }
    }

    /**
     * There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first
     * letters of the infinite string.
     *
     * Example
     *
     *
     * The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.
     *
     * Function Description
     *
     * Complete the repeatedString function in the editor below.
     *
     * repeatedString has the following parameter(s):
     *
     * s: a string to repeat
     * n: the number of characters to consider
     * Returns
     *
     * int: the frequency of a in the substring
     * @param s
     * @param n
     * @return
     */
    public static long repeatedString(String s, long n) {
        // Write your code here
        int size = s.length();
        if (n < size) {
            long number = 0;
            for (int i = 0; i< n; i++) {
                if (s.charAt(i) == 'a') number++;
            }
            return number;
        } else {
            long number = 0;
            for (int i = 0; i< size; i++) {
                if (s.charAt(i) == 'a') number++;
            }
            return number * (n/size) + repeatedString(s, n%size);
        }
    }
}
