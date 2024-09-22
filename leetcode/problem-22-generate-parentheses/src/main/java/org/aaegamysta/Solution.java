package org.aaegamysta;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        var possibleCombinations = new ArrayList<String>();
        this.backTrack(
                possibleCombinations,
                new StringBuilder("("),
                n,
                0,
                1
        );
        return possibleCombinations;
    }

    public void backTrack(List<String> list, StringBuilder builder,int size, int closed, int open) {
        if(closed > open) {
            return;
        }

        if(size * 2 == closed + open) {
            list.add(builder.toString());
            return;
        }

        if(closed < open) {
            StringBuilder newBuilder1 = new StringBuilder(builder);
            newBuilder1.append(')');
            backTrack(list, newBuilder1, size, closed +1, open);
        }
        if(open <  size){
            StringBuilder newBuilder2 = new StringBuilder(builder);
            newBuilder2.append('(');
            backTrack(list, newBuilder2, size, closed, open + 1);
        }
    }
}
