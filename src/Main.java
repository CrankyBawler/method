public class Main {
    public static int year(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + "год — невисокосный год");
        }
        return year;
    }

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2008;
        year(year);
        }
    }
