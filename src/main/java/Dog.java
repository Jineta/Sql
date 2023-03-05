import java.time.Year;

public class Dog {
    private int dogId;
    private String dogName;
    private int birthYear;

    public Dog(int dogId, String dogName, int birthYear) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.birthYear = birthYear;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void changeAge(int yearsToChange) {
        if (this.birthYear + yearsToChange > Year.now().getValue()) {
            System.out.println("New birth year is greater current year. Impossible to make changes");
        } else {
            this.birthYear = this.birthYear + yearsToChange;
        }
    }
}

