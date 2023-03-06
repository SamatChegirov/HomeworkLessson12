import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private LocalDate DateOfBirthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirthDay() {
        return DateOfBirthDay;
    }

    public void setDateOfBirthDay(LocalDate dateOfBirthDay) {
        DateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public String toString() {
        return "Person: " + "Name: " + name + ", Age: " + age + ", Date Of Birth Day: " + DateOfBirthDay;
    }
}
