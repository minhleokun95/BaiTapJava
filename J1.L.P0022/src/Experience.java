public class Experience extends Candidate {

    private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill,
                      String id, String firstName, String lastName, int birthDate,
                      String Address, String Phone, String Email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, Address, Phone, Email,
                typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

}
