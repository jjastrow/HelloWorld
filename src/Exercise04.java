import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zach on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        List<String> wordList = Arrays.asList(words);
        LinkedHashSet<String> wordSet = new LinkedHashSet<String>(wordList);
        System.out.println(String.join(" ", wordSet));
        // to be or not that is the question
    }
}
