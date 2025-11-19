package exceptionsdemo;

class InvalidStudentException extends Exception {
    public InvalidStudentException(String msg) { super(msg); }
}

class OnlineExam {

    void validateStudent() throws InvalidStudentException {
        throw new InvalidStudentException("Student ID not found.");
    }

    void submitExam() throws InvalidStudentException, java.io.IOException {
        validateStudent();
        throw new java.io.IOException("File upload issue.");
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {

        OnlineExam exam = new OnlineExam();

        try {
            exam.submitExam();
        } catch (InvalidStudentException e) {
            System.out.println("Student Error: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
