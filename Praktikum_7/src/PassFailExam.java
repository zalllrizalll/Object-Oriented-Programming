public class PassFailExam extends PassFailActivity{
    private int numberOfQuestions, numberMissed;
    private double pointsPerQuestion;
    
    // Constructor
    public PassFailExam(int questions, int missed, double minPassing){
        super(minPassing);
        numberOfQuestions = questions;
        numberMissed = missed;
    }

    public double getPointsEach(){
        return pointsPerQuestion;
    }

    public int getNumMissed(){
        return numberMissed;
    }
}