import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class App {

        public static void main(String[] args) {
            List<Student> list = new ArrayList<Student>();
            list.add(new Student(1, "Иванов"));
            list.add(new Student(2, "Петров"));
            list.add(new Student(1, "Сидоров"));
            list.add(new Student(2, "Jackson"));
            list.add(new Student(1, "Smith"));

            int course = 1;
            printStudents(list, course);

            course = 2;
            printStudents(list, course);
        }

        public static void printStudents(List<Student> students, int course) {
            System.out.println("Студенты " + course + " курса:");

            Iterator<Student> iter = students.iterator();
            while (iter.hasNext()) {
                Student student = iter.next();
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
        
    }

