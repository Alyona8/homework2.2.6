import java.util.*;
public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static String words = "быть или не быть - таков вопрос; что лучше, что благородней для души";

    static void printOdds(List<Integer> lst) {
        for (int e : lst) {
            if (e % 2 != 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    static void printEvenAscending(List<Integer> lst) {
        for (int e : new TreeSet<Integer>(lst)) {
            if (e % 2 == 0) {
                System.out.print(e + " ");
            }
        }
        System.out.println();
    }

    static void printUniqueWords(String text) {
        Set<String> uniqueWords = new HashSet<>(List.of(text.split("\\s+")));
        for (var word : uniqueWords) {
            System.out.println(word);
        }
    }

    static void printNumberOfRepeatingWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> repeats = new HashMap<>();

        for (var word : words) {
            repeats.put(word, repeats.getOrDefault(word, 0) + 1);
        }

        for (int num : repeats.values()) {
            if (num > 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printOdds(nums);

        printEvenAscending(nums);

        printUniqueWords(words);

        printNumberOfRepeatingWords(words);
    }
}
