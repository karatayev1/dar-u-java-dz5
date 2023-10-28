// Homework 5
public class Main {
    public static void main(String[] args) {
        //1
        int l = 5, w = 4;

        if (l == w) {
            System.out.printf("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }

        //2
        double price = 8000;
        double limit = 5000;
        int discount = 10;

        if (price > limit) {
            price -= price * discount / 100;
        }
        System.out.println(price);

        //3
        int grade = 121;
        String result = "";

        if (grade < 0) {
            result = "Неверное значение";
        } else if (grade >= 0 && grade < 25) {
            result = "Оценка: F";
        } else if (grade >= 25 && grade < 45) {
            result = "Оценка: E";
        } else if (grade >= 45 && grade < 50) {
            result = "Оценка: D";
        } else if (grade >= 50 && grade < 60) {
            result = "Оценка: C";
        } else if (grade >= 60 && grade < 80) {
            result = "Оценка: B";
        } else if (grade >= 80 && grade <= 120) {
            result = "Оценка: A";
        } else if (grade > 120) {
            result = "Неверное значние";
        }

        System.out.println(result);

        //4
        int number = 12345;
        String s = String.valueOf(number);
        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        System.out.println(r);

        //5
        int p = 7;
        boolean prime = false;

        if (p < 2) {
            prime = false;
        } else if (p == 2) {
            prime = true;
        } else {
            for (int i = 2; i * i < p; i++) {
                if (p % i == 0) {
                    prime = false;
                } else {
                    prime = true;
                }
            }
        }
        System.out.println("Простое число: " + prime);

        //5.1
        int k = 6;

        if (k % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        //5.2
        int a = 16;
        int b = 15;

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else  {
            System.out.println("a = b");
        }

        //5.3
        int year = 2023;
        boolean leapYear;

        if (year > 1584 && ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0))) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        System.out.println("Год " + year + " високосный: " + leapYear);

        //5.4
        int day = 5;
        String weekDay = "";

        switch (day) {
            case 1 -> {
                weekDay = "Понедельник";
            }
            case 2 -> {
                weekDay = "Вторник";
            }
            case 3 -> {
                weekDay = "Среда";
            }
            case 4 -> {
                weekDay = "Четверг";
            }
            case 5 -> {
                weekDay = "Пятница";
            }
            case 6 -> {
                weekDay = "Суббота";
            }
            case 7 -> {
                weekDay = "Воскресенье";
            }
        }

        System.out.println(weekDay);
        //5.5
        int x = 4;
        int y = 5;
        int quadrant = 0;

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else if (x > 0 && y < 0) {
            quadrant = 4;
        }
        System.out.println("Квадрант: " + quadrant);

        //5.6
        int d = 4;
        int f = 5;
        int h = 6;

        if (d == f && f == h) {
            System.out.println("Треугольник равносторонний");
        } else if ((d == f && d != h || (d == h && d != f) || (f == h && f != d))) {
            System.out.println("Треугольник равнобедренный");
        } else if (d != f && d != h && f != h) {
            System.out.println("Треугольник разносторонний");
        }
    }
}