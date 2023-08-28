public class PassFailActivity extends GradedActivity{
    private double minimumPassingScore;

    // Constructor
    public PassFailActivity(double min){
        minimumPassingScore = min;
    }

    public char getGrade(){
       return super.getGrade();
    }
}