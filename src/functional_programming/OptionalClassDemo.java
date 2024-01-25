package functional_programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClassDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry");
        Predicate<String> predicate = s -> s.startsWith("c");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        if(optional.isPresent())
            System.out.println(optional.get());
        Optional<String> banana = Optional.of("banana");
    }
}
