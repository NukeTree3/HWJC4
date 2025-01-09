import java.time.LocalDate;

enum Genders{Male, Female};

public class Employee {
    private String name;
    private LocalDate birthdate;
    private Genders gender;

    public Employee(String name, LocalDate birthdate, Genders gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }
}
