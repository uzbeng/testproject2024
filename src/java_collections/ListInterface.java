package java_collections;

import java.util.*;

public class ListInterface {

    // List
    // ArrayList, LinkedList

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<Dog> linkedList = new LinkedList<>();

        String[] array = {"abc", "def"}; // static - size does not change

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        System.out.println(arrayList);

        linkedList.add(new Dog("Rex", 3));
        Dog dog1 = new Dog("Chappi", 1);
        linkedList.add(dog1);
        linkedList.add(1, new Dog("Bobik", 2));


        String name = linkedList.get(1).getName();



        LinkedList<Dog> linkedList2 = new LinkedList<Dog>();
        linkedList2.add(new Dog("Prince", 4));
        linkedList.addAll(linkedList2);

        Collections.sort(linkedList, Comparator.comparing(Dog::getAge));


        Collections.reverse(linkedList);

        for(int i=0; i<linkedList.size(); i++) {
            System.out.println("Name: " + linkedList.get(i).getName() );
            System.out.println("Age: " + linkedList.get(i).getAge());
        }




    }
}
