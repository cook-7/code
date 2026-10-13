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

public class EmployeeGenericsDemo {
    public static void main(String[] args) {
        Box<String> deptBox = new Box<>();
        deptBox.set("Technology Division");
        System.out.println("Box Department: " + deptBox.get());

        List<Integer> empIds = new ArrayList<>();
        empIds.add(5001);
        empIds.add(5002);
        empIds.add(5001);

        List<String> empNames = new LinkedList<>();
        empNames.add("Rohan");
        empNames.add("Kavita");
        empNames.add("Rohan");

        Set<Integer> uniqueEmpIds = new HashSet<>();
        uniqueEmpIds.add(5001);
        uniqueEmpIds.add(5002);
        uniqueEmpIds.add(5001);

        System.out.println("\n--- Employee IDs (ArrayList) ---");
        Iterator<Integer> idIt = empIds.iterator();
        while (idIt.hasNext()) {
            System.out.println("ID: " + idIt.next());
        }

        System.out.println("\n--- Employee Names (LinkedList) ---");
        Iterator<String> nameIt = empNames.iterator();
        while (nameIt.hasNext()) {
            System.out.println("Name: " + nameIt.next());
        }

        System.out.println("\n--- Unique Employee IDs (Set) ---");
        Iterator<Integer> uniqueIt = uniqueEmpIds.iterator();
        while (uniqueIt.hasNext()) {
            System.out.println("Unique ID: " + uniqueIt.next());
        }
    }
}
