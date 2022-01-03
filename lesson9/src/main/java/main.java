import java.util.List;

public class main {
    interface Student {
        String getName();
        List<Course> getAllCourses();
    }
    interface Course {}
}
