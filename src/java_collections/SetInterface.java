package java_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetInterface {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Three");
        arrayList.add("Three");
        arrayList.add("Three");
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);

        // does not allow duplicates:
        hashSet.add("One");
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("One");
        hashSet.add("One");
        hashSet.add(null);

        System.out.println(hashSet);

        hashSet.addAll(arrayList);

        System.out.println(hashSet);

        for (String item : hashSet) {
            if(item != null) {
                if (item.equals("One")) {
                    System.out.println(item);
                    break;
                }
            }

        }


    }
}
