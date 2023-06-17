import Context.OnlineCourse;
import Context.Student;
import OnlineCourse.*;
public class EducationApp {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("JoJo");
        onlineCourse.addStudent(student);

        /*onlineCourse.addReview("Hello, Java!!", student);*/

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());

        System.out.println("==================================");

        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("Hello, Java!!", student);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());

        System.out.println("==================================");

        Student anotherStudent = new Student("Bak");
        anotherStudent.addPrivate(onlineCourse);
        onlineCourse.addStudent(anotherStudent);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }
}
