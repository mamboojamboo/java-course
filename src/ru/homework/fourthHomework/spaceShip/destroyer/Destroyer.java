package ru.homework.fourthHomework.spaceShip.destroyer;

import ru.homework.fourthHomework.spaceShip.SpaceShip;

public class Destroyer extends SpaceShip {

    public Destroyer(
            String name,
            String spaceShipClass,
            String coalition,
            int health,
            int armor,
            int power,
            int speed,
            int criticalShot
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
    }

    @Override
    public int specialSkill() {
        return this.getCriticalShot() * 10;
    }
}
