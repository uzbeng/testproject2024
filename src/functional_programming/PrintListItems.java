package functional_programming;

import java.util.List;
import java.util.stream.Collectors;

public class PrintListItems {

    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");
//        list.forEach(System.out::println);
//        list.stream()
//                .filter(n -> n.startsWith("o"))
//                .forEach(System.out::println);
//        list.stream()
//                .filter(n -> n.length() >= 4)
//                .forEach(System.out::println);
//
//
//        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7);
//
//        list2.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//
//        list2.stream().map(n -> n * n).forEach(System.out::println);
//
//        list2.stream().filter(n -> n % 2 == 1).map(n -> n*n*n).forEach(System.out::println);
        list.stream().map(n -> n.length()).forEach(System.out::println);
    }
}
