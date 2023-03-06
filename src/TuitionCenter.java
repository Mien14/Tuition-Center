import java.util.ArrayList;


public class TuitionCenter {
    private String physicalAddress;
    private HeadMaster headMaster;
    private ArrayList<Tutor> tutors;
    private ArrayList<Student> students;

    public TuitionCenter(String physicalAddress, HeadMaster headMaster) {
        this.physicalAddress = physicalAddress;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<Tutor>();
        this.students = new ArrayList<Student>();
    }

    public void addTutor(Tutor tutor) {
        this.tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor) {
        this.tutors.remove(tutor);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public Report generateReport() {
        int numStudents = this.students.size();
        int numTutors = this.tutors.size();

        // Calculate average marks
        double totalMarks = 0.0;
        for (Student student : this.students) {
            totalMarks += student.getAverageScore();
        }
        double averageMarks = totalMarks / numStudents;

        // Find minimum and maximum marks
        double minMarks = Double.MAX_VALUE;
        double maxMarks = Double.MIN_VALUE;
        for (Student student : this.students) {
            double studentAverageScore = student.getAverageScore();
            if (studentAverageScore < minMarks) {
                minMarks = studentAverageScore;
            }
            if (studentAverageScore > maxMarks) {
                maxMarks = studentAverageScore;
            }
        }

        // Collect tutor backgrounds
        ArrayList<String> tutorBackgrounds = new ArrayList<String>();
        for (Tutor tutor : this.tutors) {
            tutorBackgrounds.add(tutor.getQualification());
        }

        return new Report(numStudents, numTutors, averageMarks, minMarks, maxMarks, tutorBackgrounds);
    }
}
