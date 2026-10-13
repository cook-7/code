import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

public class GenericCollectionDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Stored Inside Generic Box");
        System.out.println("Box Value: " + stringBox.get());

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Java");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(100);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");

        System.out.println("\n--- Iterating ArrayList (List retains duplicates) ---");
        Iterator<String> listIt = arrayList.iterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("\n--- Iterating LinkedList ---");
        Iterator<Integer> linkIt = linkedList.iterator();
        while (linkIt.hasNext()) {
            System.out.println(linkIt.next());
        }

        System.out.println("\n--- Iterating HashSet (Set removes duplicates) ---");
        Iterator<String> setIt = hashSet.iterator();
        while (setIt.hasNext()) {
            System.out.println(setIt.next());
        }
    }
}
