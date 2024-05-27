import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Math", 90);
        grades.put("English", 85);
        grades.put("Science", 95);
        grades.put("History", 80);

        StudentStats stats = new StudentStats("John Doe", grades);
        stats.calculateTotal();
        stats.calculateAverage();
        stats.printGrades();
    }
}
