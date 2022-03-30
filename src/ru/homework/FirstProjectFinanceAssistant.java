package ru.homework;

import java.util.Scanner;

public class FirstProjectFinanceAssistant {

    static int account = 0;
    static boolean status = true;
    static String[][] history = new String[1][];

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (status) {
            getListOfCommands();
            runCommandInMenu(userInput.nextInt());
        }
    }

    static void runCommandInMenu(int num) {
        switch (num) {
            case (0) -> stopProgram();
            case (1) -> addFinanceOperation();
            case (2) -> delFinanceOperation();
            case (3) -> getBalance();
            case (4) -> getAllFinanceOperations();
            case (5) -> getSpecificFinanceOperation();
            default -> System.out.print("Для корректной работы программы неободимо ввести следующие комманды:...");
        }
    }

    static void addFinanceOperation() {
        System.out.print("Введите категорию и сумму: ");
        String[] categoryAndSumArr = getCategoryAndSum();
        System.out.println("_____________________________________________________");

        if (checkUserInput(categoryAndSumArr))
            return;

        if (history[0] == null) {
            history = new String[2][1];
            history[0][0] = categoryAndSumArr[0];
            history[1][0] = categoryAndSumArr[1];
            account += Integer.parseInt(categoryAndSumArr[1]);
            return;
        }

        String[][] tempHistory = new String[history.length][history[0].length + 1];

        for (int i = 0; i < history.length; i++) {
            for (int j = 0; j < history[0].length; j++) {
                tempHistory[i][j] = history[i][j];
            }
        }

        tempHistory[0][history[0].length] = categoryAndSumArr[0];
        tempHistory[1][history[0].length] = categoryAndSumArr[1];
        account += Integer.parseInt(categoryAndSumArr[1]);
        history = tempHistory;
    }

    static String[] getCategoryAndSum() {
        return new Scanner(System.in).nextLine().split(" ");
    }

    static boolean checkUserInput(String[] categoryAndSumArr) {
        if (categoryAndSumArr.length != 2) {
            System.out.println("Неправильные входные данные. Введите: категория трата/пополнение\n");
            System.out.println("_____________________________________________________");
            return true;
        }

        if (categoryAndSumArr[1].charAt(0) == '-' && account - Integer.parseInt(categoryAndSumArr[1]) < 0) {
            System.out.println("Недостаточно средств на счёте.\n");
            System.out.println("_____________________________________________________");
            return true;
        }

        return false;
    }

    static void delFinanceOperation() {
        System.out.print("Введите номер траты/пополнения, которую необходимо удалить: ");
        int categoryId = getCategoryId();

        if (history[0] == null || categoryId > history[0].length) {
            System.out.println("Категории с таким номером не существует.");
            System.out.println("_____________________________________________________");
            return;
        }

        System.out.printf("Категория №%d удалена.\n", categoryId + 1);
        System.out.println("_____________________________________________________");

        String[][] tempHistory = new String[history.length][history[0].length - 1];

        for (int i = categoryId; i < history[0].length; i++)
        {
            for (int j = i + 1; j < history[0].length; j++) {
                if (history[0][j] != null) {
                    history[0][i] = history[0][j];
                    history[1][i] = history[1][j];
                }
            }
        }

        for (int i = 0; i < tempHistory.length; i++) {
            for (int j = 0; j < tempHistory[0].length; j++) {
                tempHistory[i][j] = history[i][j];
            }
        }

        history = tempHistory;
    }

    static int getCategoryId() {
        return new Scanner(System.in).nextInt() - 1;
    }

    static void getBalance() {
        System.out.printf("Баланс Вашего счёта: %d\n\n", account);
        System.out.println("_____________________________________________________");
    }

    static void getAllFinanceOperations() {
        if (history[0] == null) {
            System.out.println("В списке нет записей.");
            System.out.println("_____________________________________________________");
            return;
        }

        System.out.println("Ваши траты/пополнения: ");
        for (int i = 0; i < history[0].length; i++) {
            System.out.printf("%d. %s %s\n", i + 1, history[0][i],  history[1][i]);
        }
        System.out.println("_____________________________________________________");
    }

    static void getSpecificFinanceOperation() {
        System.out.print("Введите категорию для поиска: ");
        String category = getCategoryForSearch();
        int counter = 0;
        for (int i = 0; i < history[0].length; i++) {
            if (category.equals(history[0][i])) {
                System.out.printf("%d. %s %s\n", i + 1, history[0][i],  history[1][i]);
                counter++;
            }
        }
        if (counter == 0)
            System.out.printf("Категории %s нет в списке.\n", category);
        System.out.println("_____________________________________________________");
    }

    static String getCategoryForSearch() {
        return new Scanner(System.in).nextLine();
    }

    static void stopProgram() {
        status = false;
    }

    static void getListOfCommands() {
        System.out.println("Комманды управленя: ");
        System.out.println("1 - Добавить трату/пополнение");
        System.out.println("2 - Удалить трату/пополнение");
        System.out.println("3 - Узнать текущий счёт");
        System.out.println("4 - Вывести все траты/пополнения");
        System.out.println("5 - Вывести траты по определенной категории");
        System.out.println("0 - Выход");
        System.out.println("_____________________________________________________");
    }
}
