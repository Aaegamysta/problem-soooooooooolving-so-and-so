package org.aaegamysta;
/*
 * Initially I applied the solution thinking that the extra letter will not be
 * a duplicate and hence the array was just a boolean and I checked for the existence
 * of the character that cannot be duplicated.
 * Making the array of type integers instead acts as a counter.
 * Checking for the second time in the string t, we will decrement the arrAsMap's entry of the character.
 * */
public class Solution {
    public char findTheDifference(String s, String t) {
        int x = -1;
        for(int i = 0; i < t.length(); i++) {
            if(x < t.charAt(i))
                x = t.charAt(i);
        }

        int[] arrAsMap = new int[x + 1];
        for(int i = 0; i < s.length(); i++)
            arrAsMap[s.charAt(i)]++;
        for(int  i = 0; i < t.length(); i++) {
            arrAsMap[t.charAt(i)]--;
        }
        for(int  i = 0; i < arrAsMap.length; i++) {
            if((arrAsMap[i]) != 0)
                return (char)i;
        }

        return t.charAt(0);
    }
}
