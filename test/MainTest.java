import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testStudentClassExists() {
        try {
            Class.forName("Student");
        } catch (ClassNotFoundException e) {
            fail("Class 'Student' not found. Please define it.");
        }
    }

    @Test
    public void testDisplayMethodExists() {
        try {
            Class<?> clazz = Class.forName("Student");
            clazz.getMethod("displayDetails");
        } catch (Exception e) {
            fail("Method 'displayDetails' not found in class 'Student'.");
        }
    }
}
