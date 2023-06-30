package practice;

import java.util.HashSet;
import java.util.Set;

public class doubles {
        public static void main(String[] args) {
            String[] colors = { "red", "blue", "white", "yellow", "pink", "blue" };

            boolean hasDuplicates = checkForDuplicates(colors);
            System.out.println(hasDuplicates);  // Output: true
        }

        public static boolean checkForDuplicates(String[] strings) {
            Set<String> uniqueStrings = new HashSet<>();

            for (String str : strings) {
                if (uniqueStrings.contains(str)) {
                    return true;  // Duplicate found
                }
                uniqueStrings.add(str);
            }

            return false;  // No duplicates found
        }

}
