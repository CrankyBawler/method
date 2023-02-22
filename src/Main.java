public class Main {
    public static int toDefinitionOfALeapYear(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println(a + " год — високосный год");
        } else {
            System.out.println(a + "год — невисокосный год");
        }
        return a;
    }

    public static int toOSTheApp(int a) {
        if (a == 0) {
            System.out.print(" для iOS");
        } else {
            System.out.print(" для android");
        }
        return a;
    }

    public static int toInstalVersion(int a) {
        if (a < 2015) {
            System.out.print(" облегченная версия приложения");
        } else {
            System.out.print(" обычная версия приложения");
        }
        return a;
    }


    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2008;
        toDefinitionOfALeapYear(year);
        }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        toInstalVersion(clientDeviceYear);
        toOSTheApp(clientOS);
    }
}
