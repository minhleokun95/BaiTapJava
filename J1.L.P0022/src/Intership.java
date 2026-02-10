public class Intership extends Candidate {

    private String major;
    private String semester;
    private String university;

    public Intership() {
        super();
    }

    public Intership(String major, String semester, String university,
                      String id, String firstName, String lastName, int birthDate,
                      String Address, String Phone, String Email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, Address, Phone, Email,
                typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
