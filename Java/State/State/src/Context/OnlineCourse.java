package Context;

import java.util.ArrayList;
import java.util.List;
import OnlineCourse.*;

public class OnlineCourse {
    private State state = new Draft(this);

    private List<Student> studentList = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public List<String> getReviews() {
        return reviews;
    }
}
