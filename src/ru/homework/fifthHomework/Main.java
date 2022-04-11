package ru.homework.fifthHomework;

public class Main {

    public static void main(String[] args) {
        Client clark = new Client("Clark", "Gable", "ENG", 33);
        Employee bob = new Employee("John", "Dow", "BEL", 27, "42 000$", 3);

        clark.print();
        bob.print();

        clark.printSeason();
        bob.printSeason();
    }
}
