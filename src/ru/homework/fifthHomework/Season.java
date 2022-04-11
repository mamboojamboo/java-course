package ru.homework.fifthHomework;

public enum Season {
    SUMMER("YELLOW"),
    AUTUMN("ORANGE"),
    WINTER("WHITE"),
    SPRING("GREEN");

    private final String color;

    Season(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
