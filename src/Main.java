public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человек равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человек равен " + age + ", то он не совершеннолетний, нужно немного подождать");
        }
        System.out.println("Task 2");
        int temp = 10;
        System.out.println("На улице " + temp + " градусов");
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Task 3");
        int speed = 70;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        }
        System.out.println("Task 4");
        int lage = 10;
        if (lage >=2 && lage <=6) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в детский сад");
        }
        if (lage >=7 && lage <=18) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в школу");
        }
        if (lage >18 && lage <24) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в университет");
        }
        if (lage >24) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить на работу");
        }
        System.out.println("Task 5");
    }
}