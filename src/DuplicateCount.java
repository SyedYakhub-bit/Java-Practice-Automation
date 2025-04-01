import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to find the duplicate characters: ");
        String string = scanner.nextLine();
        scanner.close();

        duplicateCharactersCount(string);

    }

    public static void duplicateCharactersCount(String string) {

        Map<Character, Integer> duplicateCharacterMap = new HashMap<>();
        for (char keys : string.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(keys)) {
                if (duplicateCharacterMap.containsKey(keys)) {
                    duplicateCharacterMap.put(keys, duplicateCharacterMap.get(keys) + 1);

                } else {
                    duplicateCharacterMap.put(keys, 1);
                }
            }
        }
        System.out.println(duplicateCharacterMap);
    }
}
