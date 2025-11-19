package exceptionsdemo;

class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) { super(msg); }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String msg) { super(msg); }
}

class ReviewSystem {
    void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be 1-5.");

        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Comment cannot be empty.");

        System.out.println("Review submitted successfully!");
    }
}

public class ReviewExample {
    public static void main(String[] args) {

        ReviewSystem review = new ReviewSystem();

        try {
            review.submitReview(6, "Nice product!");
        } catch (InvalidRatingException e) {
            System.out.println("Rating Error: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Comment Error: " + e.getMessage());
        }
    }
}
