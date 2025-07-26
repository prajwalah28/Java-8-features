package wiprofirst.javaeightassiment;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class eleventhassim {
    public static void main(String[] args) {
        // Sample list of names
        List<String> names = Arrays.asList("Anita", "Amit", "Rita", "Ravi", "Akasha", "Aruna");

        // Predicate: starts with "A"
        Predicate<String> startsWithA = name -> name.startsWith("A");

        // Predicate: ends with "a"
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // Combine using .and() - must start with A and end with a
        Predicate<String> combined = startsWithA.and(endsWithA);

        // Filter the names
        List<String> filtered = names.stream()
                                     .filter(combined)
                                     .collect(Collectors.toList());

        // Print result
        System.out.println("Filtered names: " + filtered);
    }
}
