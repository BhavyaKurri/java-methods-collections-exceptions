import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add student");
            System.out.println("2. View students");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine().trim();
                    if (!name.isEmpty()) {
                        students.add(name);
                        System.out.println("Student added.");
                    } else {
                        System.out.println("Name cannot be empty.");
                    }
                    break;
                case "2":
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine().trim();
                    if (students.remove(removeName)) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }
    }
}
