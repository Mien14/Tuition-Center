public class Tutor{
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private String dateJoined;
    private int yearsInCenter;

    public Tutor(String name, String IC, String address, String qualification, int yearsOfExperience, String dateJoined, int yearsInCenter){
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    public String getName(String name){
        return this.name;
    }

    public String getQualification() {
        return qualification;
    }
}
