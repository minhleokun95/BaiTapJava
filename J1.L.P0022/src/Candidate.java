import javax.print.DocFlavor;

public class Candidate {
    private String id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String Address;
    private String Phone;
    private String Email;
    private int typeCandidate;

    public Candidate(){
    }

    public Candidate(String id, String firstName, String lastName, int birthDate, String Address, String Phone, String Email, int typeCandidate){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.typeCandidate = typeCandidate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName + "|" + this.birthDate + "|"
                + this.Address + "|" + this.Phone + "|" + this.Email + "|"
                + this.typeCandidate;
    }
}


