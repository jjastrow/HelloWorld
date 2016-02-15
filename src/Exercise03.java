import java.util.HashMap;

/**
 * Created by zach on 2/15/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String word : words) {
            Integer count = frequencies.get(word);
            if (count == null) {
                frequencies.put(word, 1);
            }
            else {
                frequencies.put(word, count+1);
            }
        }
        System.out.println(frequencies);
    }
}
