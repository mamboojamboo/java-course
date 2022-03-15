package ru.homework;

public class FirstHomework {

    public static void main(String[] args) {
        printHouse();
        printEmptyLine();
        printSentences();
    }

    static void printHouse() {
        String[] housePicture = {
                "_______\"\"___",
                "_______--___",
                "____/\\_||___",
                "___/__\\||___",
                "__/____\\|___",
                "_/_[__]_\\___",
                "/|______|\\___",
                "_|__--__|____",
                "_|__||__|____"
        };

        for (String s : housePicture) {
            System.out.println(s);
        }
    }

    static void printEmptyLine() {
        System.out.print("\n");
    }

    static void printSentences() {
        System.out.printf("Город = %s, население = %d чел., безработных = %.1f%%\n", "Москва", 12_506_468, 2.5);
        System.out.printf("Секция = %c, место = %d, стоимость = %d руб.\n", 'A', 15, 2_500);
        System.out.printf("Имя = %s, возраст = %d года, рост = %d см.\n", "Alex", 43, 182);
        System.out.printf("Номер = %c%d%d%d%s%d, вес автомобиля = %.1f т.\n", 'A', 0, 0, 0, "AA", 197, 3.5);
        System.out.printf("Название компании = %s, доход = %d usd, доля рынка = %.3f%%\n", "HP", 10_000_000, 44.543);
        System.out.printf("Резус фактора = %c, группа крови = %d, доля населения = %.2f%%\n", 'A', 1, 36.44);
        System.out.printf("Название = %s, число студентов = %d чел., доля отчисленных = %.1f%%\n", "МГУ", 3_500, 43.4);
        System.out.printf("Рейтинг фильма = %s, копий продано = %d шт., процент продаж = %d%%\n", "9.1", 130_399, 37);
        System.out.printf("Название бренда = %s, произведено товра = %d шт., процент продаж = %.2f%%\n", "H&M", 20_500, 23.99);
        System.out.printf("Категория товара = %c, штрих код = %d , процент покупателей страше 30 = %.4f%%\n", 'C', 427777112737732L, 67.4567);
    }

}
