package org.aaegamysta;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();
        var list = sol.generateParenthesis(3);
        list.forEach(System.out::println);
    }
}