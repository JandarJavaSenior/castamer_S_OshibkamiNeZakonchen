import java.time.LocalDate;

public class Passport {
    private LocalDate aga;
    private String gender;
    private String country;

    public Passport(LocalDate aga, String gender, String country) {
        this.aga = aga;
        this.gender = gender;
        this.country = country;
    }

    public LocalDate getAga() {
        return aga;
    }

    public void setAga(LocalDate aga) {
        this.aga = aga;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Passport() {

    }



}
