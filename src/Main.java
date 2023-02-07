public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        checkLeapYear(year);
    }

    public static void checkOSAndYear(byte clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2021;
        checkOSAndYear(clientOS, clientDeviceYear);
    }

    public static int checkDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance > 20 && distance <= 60) {
            deliveryDays++;
        } else if (distance > 60 && distance <= 100) {
            deliveryDays += 2;
        } else if (distance > 100) {
            return 0;
        }
        return deliveryDays;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 21;
        int deliveryDays = checkDeliveryDays(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("На доставку потребуется " + deliveryDays + " дня");
        }
    }
}