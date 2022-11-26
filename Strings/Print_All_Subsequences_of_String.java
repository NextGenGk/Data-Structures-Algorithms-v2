package Strings;

import java.util.ArrayList;
import java.util.List;

public class Print_All_Subsequences_of_String {

    static List<String> list = new ArrayList<>();

    public static void findSubsequences(String s, String ans) {

        if (s.length() == 0) {
            list.add(ans);
            return;
        }

        findSubsequences(s.substring(1), ans + s.charAt(0));
        findSubsequences(s.substring(1), ans);
    }

    public static void main(String[] args) {
        String s = "abc";
        findSubsequences(s, "");
        System.out.println(list);
    }
}
