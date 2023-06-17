package OnlineCourse;

import Context.Student;

public interface State {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
