public class Celebration {

    private String nameOfCelebration;
    private int month;
    private int day;
    private Genders gender;

    public Celebration(String nameOfCelebration, int month, int day, Genders gender) {
        this.nameOfCelebration = nameOfCelebration;
        this.month = month;
        this.day = day;
        this.gender = gender;
    }

    public String getNameOfCelebration() {
        return nameOfCelebration;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Genders getGender() {
        return gender;
    }
}
