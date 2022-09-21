import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        String str1 = "leetcodde";
        String str2 = "loveleetcode";

        lookingForFirstNonFrequency(str1);
        lookingForFirstNonFrequency(str2);
    }

    public static void lookingForFirstNonFrequency(String string){

        Map<Character, Node> map = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), map.containsKey(string.charAt(i)) ? null : new Node(string.charAt(i), i));
        }
        Optional<Map.Entry<Character, Node>> getFirstUnique = map.entrySet().stream().filter(i -> i.getValue() != null).findFirst();
        if (getFirstUnique.isPresent())
            System.out.printf("First unique char is: %s , with index: %s \n" , getFirstUnique.get().getKey(),getFirstUnique.get().getValue());
        else
            System.out.println("No unique element");
    }
}