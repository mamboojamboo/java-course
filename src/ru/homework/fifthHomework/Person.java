package ru.homework.fifthHomework;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String nativeLanguage;
    private int age;

    public Person() {}
    public Person(String firstName, String lastName, String nativeLanguage, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nativeLanguage = nativeLanguage;
        this.age = age;
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

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
