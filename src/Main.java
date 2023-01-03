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
    }
}