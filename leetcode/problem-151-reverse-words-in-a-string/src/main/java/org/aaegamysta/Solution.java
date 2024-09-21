package org.aaegamysta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String reverseWords(String s) {
        String[] stringsArr = s.split(" ");
        var strings = Arrays.stream(stringsArr).filter(str -> !str.equals("")).toList();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < strings.size(); i++) {
            builder.append(strings.get(strings.size() - i - 1));
            if(i == strings.size() - 1) {
                continue;
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
