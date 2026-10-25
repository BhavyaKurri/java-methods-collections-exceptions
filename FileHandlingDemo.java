import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIODemo {
    public static void main(String[] args) {
        Path file = Path.of("student.txt");
        try {
            Files.writeString(file, "Hello! This text was saved using Java file I/O.\n");
            String content = Files.readString(file);
            System.out.println("File content:");
            System.out.print(content);
        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
}
