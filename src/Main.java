import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        lesson9();

    }
    private static void lesson9(){

        int salary = 29000;
        double total = 0;
        for (int i = 1; i < 12; i++) {
            total = (total + salary)*1.01f;

            System.out.println("Месяц " + i + " Сумма накоплений = " + (int)total);
        }

    }
    private static void lesson8(){

        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накоплений = " + total);
        }

    }
    private static void lesson7(){
            int i = 1;
        do {
            i = i * 2;
            System.out.println(i);
        }while (i < 512);
    }
    private static void lesson6(){
        for(int i = 7;i <= 98;i++){
            if (i % 7 == 0)System.out.println(i);
        }
    }

    private static void lesson5 (){

        for (int i = 1904; i<= 2096;i++){
            if (i % 4 == 0)System.out.println(i + " год является високосным.");
        }
    }

    private static void lesson4() {

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

    }

    private static void lesson3() {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    private static void lesson2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    private static void lesson1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
}