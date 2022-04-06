package ru.homework.fourthHomework.spaceShip.corvette;

import ru.homework.fourthHomework.spaceShip.SpaceShip;

public class Corvette extends SpaceShip {

    public String capitanName;

    public Corvette(
            String name,
            String spaceShipClass,
            String coalition,
            int health,
            int armor,
            int power,
            int speed,
            int criticalShot,
            String capitanName
    ) {
        super(
                name,
                spaceShipClass,
                coalition,
                health,
                armor,
                power,
                speed,
                criticalShot
        );
        this.capitanName = capitanName;
    }


    @Override
    public int specialSkill() {
        return this.getCriticalShot() * this.getSpeed();
    }

    public void exit() {
        System.out.println("Exit..");
    }
}
