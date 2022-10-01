public class Main {
    public static void main(String[] args) {
        lesson1();
        lesson2();
        lesson3();
        lesson4();
        lesson5();
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

    static void lesson4() {

        int deliveryDistance = 95;
        short etaDays = 1;

        if (deliveryDistance > 20)
            etaDays++;
        if (deliveryDistance >= 60)
            etaDays++;
        if (deliveryDistance >= 100) etaDays++;

        System.out.println("Потребуется дней: " + etaDays);

    }

    static void lesson5() {

        int month = 12;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неизвестный месяц!");
                break;
        }

    }

}