import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    static int totalScore = 0;

    @Test
    public void testStudentClassExists() {
        try {
            Class.forName("Student");
            System.out.println("✅ Class 'Student' exists → 5 points");
            totalScore += 5;
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class 'Student' not found → 0 points");
            fail("Class 'Student' not found.");
        }
    }

    @Test
    public void testDisplayMethodExists() {
        try {
            Class<?> clazz = Class.forName("Student");
            clazz.getMethod("displayDetails");
            System.out.println("✅ Method 'displayDetails()' exists → 5 points");
            totalScore += 5;
        } catch (Exception e) {
            System.out.println("❌ Method 'displayDetails()' not found → 0 points");
            fail("Method 'displayDetails()' not found.");
        }
    }

    @Test
    public void printTotalScore() {
        System.out.println("🏁 Total Score: " + totalScore + " / 10");
    }
}
