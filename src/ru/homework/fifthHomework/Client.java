package ru.homework.fifthHomework;

public class Client extends Person implements Printable, SeasonHandler {

    public Client() {}
    public Client(String firstName, String lastName, String nativeLanguage, int age) {
        super(firstName, lastName, nativeLanguage, age);
    }

    public void print() {
        System.out.printf("Client first name = %s, last name = %s, native language = %s, age = %d\n",
                getFirstName(), getLastName(), getNativeLanguage(), getAge());
    }

    public void printSeason() {
        for (Season season: Season.values()) {
            System.out.printf("Сейчас %s.%s\n", season, season.getColor());
        }
    }
}
