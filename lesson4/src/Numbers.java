import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        String[] words = {"Ivanov", "Petrov", "Sidorov", "Galkin", "Palkin", "Gus", "Lunin", "Zotin", "Ivanov", "Galkin"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Telephones pb = new Telephones();

        pb.add("Ivanov", "103");
        pb.add("Ivanov", "536");
        pb.add("Petrov", "765");

        System.out.println(pb.get("Ivanov"));
    }
}
