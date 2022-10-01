import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int year = 1600;
        boolean leapYear = searchLeapYear(year);
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }

        task2();
        task3();
    }
    public static boolean searchLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else return false;
    }

    public static void task2 () {
        String osName = "Android";
        int clientOS = getClientOS(osName);
        int phoneYear = getClientYear(2022);
        if (clientOS == 0) {
            if ( phoneYear == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneYear == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }

    }
    public static int getClientYear(int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void task3() {
        int deliveryDistance = calculationDelivery(60);
        System.out.println("Потребуется дней: " + deliveryDistance);
    }
    public static int calculationDelivery(int distance) {
        int deliveryTime = 0;
        if (distance < 20) {
            return deliveryTime + 1;
        } else if (distance <= 60) {
            return deliveryTime + 2;
        } else return deliveryTime + 3;
    }
}
