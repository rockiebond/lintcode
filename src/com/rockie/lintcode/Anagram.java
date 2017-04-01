package com.rockie.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baidu on 16/2/19.
 */
public class Anagram {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) {
            return false;
        }

        if(s.length() != t.length()) {
            return false;
        }
        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();

        int counter[] = new int[256];

        for (int i = 0; i <arrS.length; i++) {
            counter[arrS[i]] += 1;
            counter[arrT[i]] -= 1;
        }

        for (int i = 0; i < arrS.length; i++) {
            if(counter[arrS[i]] != 0) {
                return false;
            }
        }

        return true;
    }
}

