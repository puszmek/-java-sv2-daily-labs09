package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> shortWords = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String actual : words) {
            if (actual.length() < minLength) {
                minLength = actual.length();
                shortWords.clear();
            }
            if ( actual.length() == minLength) {
                shortWords.add(actual);
            }
        }
        return shortWords;
    }
}
