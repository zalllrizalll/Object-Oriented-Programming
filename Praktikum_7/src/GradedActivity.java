public class GradedActivity {
    private double score;
    private String name;

    // Default Constructor
    public GradedActivity(){}

    public GradedActivity(String n){
        name = n;
    }

    public void setScore(double s){
        score = s;
    }

    public double getScore(){
        return score;
    }

    public char getGrade(){
        if(score >= 70){
            return 'A';
        } else {
            return 'E';
        }
    }
}