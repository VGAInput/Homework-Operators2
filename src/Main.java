import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //// Домашнее задание: Циклы - ч.2 \\\\\

    }

    private static void lesson9() {
        int multiplyNumber = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplyNumber + "*" + i + "=" + multiplyNumber * i);
        }
    }

    private static void lesson8() {

        int cometFlyByYear = 79;
        int currentYear = 2022;

        for (int i = currentYear - 200; i <= currentYear + cometFlyByYear; i++) {
            if (i % cometFlyByYear == 0) {
                System.out.println(i);
            }
        }
    }

    private static void lesson7() {

        int friday = 1;
        for (int f = friday; f <= 31; f += 7) {
            System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void lesson6() {
        float percentage = 1.07f;
        int investment = 15000;

        int month = 0;
        int years = 9;

        while (month <= years * 12) {
            investment *= percentage;
            month++;
            if (month % 6 == 0) System.out.println("Месяц:" + month + ",сумма:" + investment);
        }
    }

    private static void lesson5() {
        float percentage = 1.07f;
        int investment = 15000;

        int targetSum = 12_000000;
        int month = 0;

        while (investment <= targetSum) {
            investment *= percentage;
            month++;
            if (month % 6 == 0) System.out.println("Месяц:" + month + ",сумма:" + investment);
        }

    }

    private static void lesson4() {
        float percentage = 1.07f;
        int investment = 15000;

        int targetSum = 12_000000;
        int month = 0;

        while (investment <= targetSum) {
            investment *= percentage;
            month++;
            System.out.println("Месяц:" + month + ",сумма:" + investment);
        }
    }

    private static void lesson3() {
        int population = 12_000_000;
        int average = 1000;

        int deathrate = 8 * population / average;
        int birthRate = 17 * population / average;

        for (int i = 1; i <= 10; i++) {
            population += birthRate;
            population -= deathrate;
            System.out.println("Год: " + i + ", численность населения составляет: " + population);
        }
    }

    private static void lesson2() {

        int counter = 0;

        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }

        System.out.print("\n");

        for (; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
    }

    private static void lesson1() {

        int salary = 15000;
        int month = 0;
        int target = 2_459_000;
        double total = 0;

        while (total < target) {
            month++;
            total = total + salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }
    }
}