import java.util.Arrays;

public class ReverseWordsOfString {
    public static String reverseWords(String[] words) {
        int i = 0;
        int j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s1 = "getting good at coding needs a lots of practice";
        String s = "a good   example";
        String words[] = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        String fs = reverseWords(words);
        System.out.println(fs);
    }
}
