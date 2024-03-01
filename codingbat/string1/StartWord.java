package string1;

public class StartWord {
    public static String startWord(String str, String word) {

        if (str.length() > word.length() || str.length() == word.length()) {
            if (str.substring(1, word.length()).equals(word.substring(1, word.length())))
                return str.substring(0, word.length());
            else
                return "";
        } else {
            return "";
        }
    }

}
