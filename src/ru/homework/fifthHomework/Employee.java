package ru.homework.fifthHomework;

public class Employee extends Person implements Printable, SeasonHandler {

    private String salary;
    private int experience;

    public Employee() {}
    public Employee(String firstName, String lastName, String nativeLanguage, int age, String salary, int experience) {
        super(firstName, lastName, nativeLanguage, age);
        this.salary = salary;
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void print() {
        System.out.printf("Employee first name = %s, last name = %s, native language = %s, age = %d, salary = %s, " +
                        "experience = %d years\n",
                getFirstName(), getLastName(), getNativeLanguage(), getAge(), getSalary(), getExperience());
    }

    public void printSeason() {
        for (Season season: Season.values()) {
            System.out.printf("Сейчас %s.%s\n", season, season.getColor());
        }
    }
}
