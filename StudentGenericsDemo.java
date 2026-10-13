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
        return item;
    }
}

public class StudentGenericsDemo {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(101);
        System.out.println("Box contains Roll No: " + box.get());

        List<String> studentNames = new ArrayList<>();
        studentNames.add("Aarav");
        studentNames.add("Diya");
        studentNames.add("Aarav");

        List<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(101);

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Aarav");
        uniqueNames.add("Diya");
        uniqueNames.add("Aarav");

        System.out.println("\n--- Student Names (ArrayList with Duplicates) ---");
        Iterator<String> nameIt = studentNames.iterator();
        while (nameIt.hasNext()) {
            System.out.println(nameIt.next());
        }

        System.out.println("\n--- Roll Numbers (LinkedList with Duplicates) ---");
        Iterator<Integer> rollIt = rollNumbers.iterator();
        while (rollIt.hasNext()) {
            System.out.println(rollIt.next());
        }

        System.out.println("\n--- Unique Student Names (Set) ---");
        Iterator<String> setIt = uniqueNames.iterator();
        while (setIt.hasNext()) {
            System.out.println(setIt.next());
        }
    }
}
