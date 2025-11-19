package exceptionsdemo;

import java.time.LocalDateTime;

class LateSubmissionException extends Exception {
    public LateSubmissionException(String msg) {
        super(msg);
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String msg) {
        super(msg);
    }
}

class ExamSubmission {
    LocalDateTime deadline = LocalDateTime.of(2025, 1, 1, 12, 0);

    void submitExam(String fileName, LocalDateTime submittedTime)
            throws LateSubmissionException, InvalidFileFormatException {

        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Only PDF allowed.");

        if (submittedTime.isAfter(deadline))
            throw new LateSubmissionException("Submission is late.");

        System.out.println("Exam submitted successfully.");
    }
}

public class ExamSubmissionExample {
    public static void main(String[] args) {
        ExamSubmission exam = new ExamSubmission();

        try {
            exam.submitExam("answer.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println("Submission failed: " + e.getMessage());
        }
    }
}
