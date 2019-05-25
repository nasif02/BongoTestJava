package first;

import java.util.Arrays;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 5/25/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     :
 * Comment  :
 */
public class AnagramUtils {

    /**
     * Method to check whether two strings are anagram
     *
     * @param s1 first string
     * @param s2 second string
     * @return {@code true} if the given strings are anagram, {@code false} otherwise
     */
    public static boolean isAnagram(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        // length should be same to be anagram
        if (n1 != n2)
            return false;

        // now they are same length string

        s1 = sortString(s1);
        s2 = sortString(s2);


        if (s1.equals(s2))
            return true;
        else
            return false;


    }


    //

    /**
     * Method to sort a string alphabetically
     *
     * @param s input string
     * @return sorted {@code String}
     */
    public static String sortString(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

}
