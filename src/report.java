import java.util.*;

class Report {
    private int numStudents;
    private int numTutors;
    private double averageMarks;
    private double minMarks;
    private final double maxMarks;
    private ArrayList<String> tutorBackgrounds;

    public Report(int numStudents, int numTutors, double averageMarks, double minMarks, double maxMarks, ArrayList<String> tutorBackgrounds) {
        this.numStudents = numStudents;
        this.numTutors = numTutors;
        this.averageMarks = averageMarks;
        this.minMarks = minMarks;
        this.maxMarks = maxMarks;
        this.tutorBackgrounds = tutorBackgrounds;
    }

    public int getNumStudents() {
        return this.numStudents;
    }

    public int getNumTutors() {
        return this.numTutors;
    }

    public double getAverageMarks() {
        return this.averageMarks;
    }

    public double getMinMarks() {
        return this.minMarks;
    }

    public double getMaxMarks() {
        return this.maxMarks;
    }

    public ArrayList<String> getTutorBackgrounds() {
        return this.tutorBackgrounds;
    }
}