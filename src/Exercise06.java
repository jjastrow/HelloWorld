import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by zach on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};

        // reverse the list
        /*
        //String[] reversedNames = new String[names.length];
        ArrayList<String> reversedNames = new ArrayList<>();
        for (int i = names.length-1; i >= 0; i--) {
            //reversedNames[names.length-i-1] = names[i];
            reversedNames.add(names[i]);
        }
        */
        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        // turn it into a HashMap
        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }

        // {"Smith":"Alice", "Hope":"Bob", "Brown":"Charlie"}
        System.out.println(nameMap);
    }
}
