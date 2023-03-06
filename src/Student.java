import java.util.*;

public class Student {
    private String name;
    private String IC;
    private String address;
    private int year;
    private String schoolName;
    private ArrayList<Integer> scores;

    public Student(String name, String IC, String address, int year, String schoolName, ArrayList<Integer> scores){
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
    }

    public double getAverageScore() {
        int totalScore = 0;
        for (int score : this.scores) {
            totalScore += score;
        }
        return (double) totalScore / this.scores.size();
    }
}
