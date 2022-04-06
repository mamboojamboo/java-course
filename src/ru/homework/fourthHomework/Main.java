package ru.homework.fourthHomework;

import ru.homework.fourthHomework.spaceShip.SpaceShip;
import ru.homework.fourthHomework.spaceShip.corvette.Corvette;
import ru.homework.fourthHomework.spaceShip.destroyer.Destroyer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int userChoice;

        SpaceShip enemyDestroyer = new Destroyer(
                "T22",
                "Dreadnought",
                "SAR",
                500,
                1200,
                500,
                100,
                1700
        );

        Corvette capitanShip = new Corvette(
                "F-12",
                "Unity",
                "RAS",
                370,
                700,
                120,
                500,
                310,
                ""
        );

        System.out.print("Enter your name: ");
        capitanShip.capitanName = scr.nextLine();

        startingScript(capitanShip);
        System.out.println("Make yours choice: 0 - wait, 1 - try to cheat, 2 - attack");

        userChoice = scr.nextInt();
        if (userChoice == 0) waitScript(enemyDestroyer, capitanShip);
        if (userChoice == 1) tryToCheatScript(enemyDestroyer, capitanShip);
        if (userChoice == 2) attackScript(enemyDestroyer, capitanShip);
    }

    static void startingScript(Corvette capitan) {
        System.out.printf("...Your battleship %s from coalition %s is jumping out of" +
                        " a space gate right in front of an unidentified ship...\n",
                capitan.getName(),
                capitan.getCoalition());
        System.out.printf("Navigator: Capitan %s this ship guards the gate, they are scanning our systems...\n", capitan.capitanName);
    }

    static void waitScript(SpaceShip enemy, Corvette capitan) {
        System.out.printf("Capitan %s: lets wait... Maybe they will contact to us...\n", capitan.capitanName);

        capitan.setHealth(capitan.getHealth() - enemy.getPower());
        if (capitan.getHealth() > 0)
            System.out.println("Unidentified ship attack yours, damage was not to critical, your still alive...");
        else
            System.out.println("Unidentified ship attack yours, damage was to critical, your ship destroyed, you die...");
    }

    static void tryToCheatScript(SpaceShip enemy, Corvette capitan) {
        System.out.printf("Capitan %s: what is his coalition?\n", capitan.capitanName);
        System.out.printf("Navigator: %s sir.\n", enemy.getCoalition());
        System.out.printf("Capitan %s: Lets try to cheat them, Navigator change our coalition to %s\n", capitan.capitanName, enemy.getCoalition());

        capitan.setCoalition(enemy.getCoalition());
        System.out.printf("Capitan %s: Navigator did we make it? Whats our coalition?\n", capitan.capitanName);
        System.out.println("Navigator: yes sir, we can go.");
        capitan.exit();
    }

    static void attackScript(SpaceShip enemy, Corvette capitan) {
        System.out.printf("Capitan  %s: Attack!\n", capitan.capitanName);

        enemy.setHealth(enemy.getHealth() - capitan.getPower());
        if (capitan.getHealth() > 0) {
            System.out.println("Yours ship attack Unidentified ship, damage was not to critical, they still alive.");
            capitan.setHealth(capitan.getHealth() - enemy.getCriticalShot());
            System.out.println("Unidentified ship attack yours, damage was to critical, your ship destroyed, you die...");
        }
        else
        {
            System.out.println("Unidentified ship destroyed.");
            capitan.exit();
        }

    }

}
