package ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public static List<String> wordsWithoutList(String[] words, int len) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            if (words[i].length() != len)
                list.add(words[i]);

        return list;
    }

}
