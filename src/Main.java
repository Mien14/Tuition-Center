import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeadMaster headMaster = new HeadMaster("John Baker", "011-555-7194");
        TuitionCenter tuitionCenter = new TuitionCenter("411 St Columba", headMaster);

        Tutor tutor1 = new Tutor("Sam Smith", "1434567111", "350 St Joseph", "Degree in Mathematics", 5, "2020-01-01", 2);
        Tutor tutor2 = new Tutor("Bob Jake", "1987754321", "999 Chung Hua", "Masters in Physics", 10, "2010-01-01", 5);
        tuitionCenter.addTutor(tutor1);
        tuitionCenter.addTutor(tutor2);

        ArrayList<Integer> scores1 = new ArrayList<Integer>();
        scores1.add(90);
        scores1.add(80);
        scores1.add(90);
        Student student1 = new Student("Janet Jane", "4567890123", "700 St Elm", 10, "Science School", scores1);
        ArrayList<Integer> scores2 = new ArrayList<Integer>();
        scores2.add(80);
        scores2.add(90);
        scores2.add(60);
        Student student2 = new Student("Sam Smith", "0123456789", "144 St Orchid", 10, "Lutong School", scores2);
        tuitionCenter.addStudent(student1);
        tuitionCenter.addStudent(student2);

        Report report = tuitionCenter.generateReport();
        System.out.println("Number of students: " + report.getNumStudents());
        System.out.println("Number of tutors: " + report.getNumTutors());
        System.out.println("Average marks: " + report.getAverageMarks());
        System.out.println("Minimum marks: " + report.getMinMarks());
        System.out.println("Maximum marks: " + report.getMaxMarks());
        System.out.println("Tutor backgrounds: " + report.getTutorBackgrounds());
    }
}