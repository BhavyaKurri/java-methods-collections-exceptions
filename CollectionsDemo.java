import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anu");
        names.add("Ravi");
        names.add("Anu");
        System.out.println("ArrayList: " + names);

        HashSet<String> uniqueNames = new HashSet<>(names);
        System.out.println("HashSet (unique names): " + uniqueNames);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Anu");
        students.put(102, "Ravi");
        System.out.println("HashMap: " + students);
        System.out.println("Student 101: " + students.get(101));
    }
}
