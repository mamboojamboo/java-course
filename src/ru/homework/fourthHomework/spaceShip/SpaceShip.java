package ru.homework.fourthHomework.spaceShip;

public abstract class SpaceShip {

    private String name;
    private String spaceShipClass;
    private String coalition;
    private int health;
    private int armor;
    private int power;
    private int speed;
    private int criticalShot;

    public SpaceShip(){}

    public SpaceShip(
        String name,
        String spaceShipClass,
        String coalition,
        int health,
        int armor,
        int power,
        int speed,
        int criticalShot
    ) {
        this.name = name;
        this.spaceShipClass = spaceShipClass;
        this.coalition = coalition;
        this.health = health;
        this.armor = armor;
        this.power = power;
        this.speed = speed;
        this.criticalShot = criticalShot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpaceShipClass() {
        return spaceShipClass;
    }

    public void setSpaceShipClass(String spaceShipClass) {
        this.spaceShipClass = spaceShipClass;
    }

    public String getCoalition() {
        return coalition;
    }

    public void setCoalition(String coalition) {
        this.coalition = coalition;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCriticalShot() {
        return criticalShot;
    }

    public void setCriticalShot(int criticalShot) {
        this.criticalShot = criticalShot;
    }

    public abstract int specialSkill();
}
