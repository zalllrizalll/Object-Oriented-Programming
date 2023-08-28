public class FinalExam extends GradedActivity{
    private int numberOfQuestions, numberMissed;
    private double pointsPerQuestion;

    // Constructor
    public FinalExam(int questions, int missed){
        numberOfQuestions = questions;
        numberMissed = missed;
    }

    public double getPointsPerQuestion(){
        return pointsPerQuestion;
    }

    public int getNumberMissed(){
        return numberMissed;
    }
}