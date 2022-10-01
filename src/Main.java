public class Main {
    public static void main(String[] args) {
       lesson1();
       lesson2();
       lesson3();

    }

    static void lesson1() {

        byte clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
        }
    }

    static void lesson2() {

        byte clientOS = 1;
        int clientDeviceYear = 2014;

        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else System.out.println("Установите версию приложения для iOS по ссылке");

                break;
            case 1:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    static void lesson3() {
        int year = 2016;
        boolean leapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else leapYear = false;
            } else leapYear = true;
        } else leapYear = false;

        if (leapYear)
            System.out.println(year + " год является високосным.");
        else
            System.out.println(year + " год не является високосным.");
    }

    static void lesson4(){

    }

}