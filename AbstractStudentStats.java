import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStudentStats implements Statistics {
    protected String studentName;
    protected Map<String, Integer> grades;

    public AbstractStudentStats(String studentName, Map<String, Integer> grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public void calculateTotal() {
        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }
        System.out.println("Total: " + total);
    }

    abstract public void calculateAverage();
    
}
