import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String phrase = "I'm sorry, but we're going to eat you now";

        Function <String, List<String>> function = str -> Arrays.stream(str.split(" "))
                .distinct()
                .map(String::toLowerCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(function.apply(phrase).toString());
    }
}