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
        if (lage >= 2 && lage <= 6) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в детский сад");
        } else if (lage >= 7 && lage <= 18) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в школу");
        } else if  (lage > 18 && lage < 24) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить в университет");
        } else if (lage > 24) {
            System.out.println("Если возраст человека равен " + lage + ", то ему надо ходить на работу");
        }
        System.out.println("Task 5");
        int rideAge = 1;
        if (rideAge >= 5) {
            System.out.println("Если возраст ребенка равен " + rideAge);
        } else {
            System.out.println("Если возраст ребенка равен " + rideAge + ", то ему нельзя кататься!");
        }
        if (rideAge >= 5 && rideAge <= 14) {
            System.out.println(", то ему можно кататься в сопровождении родителей");
        }
        if (rideAge > 14) {
            System.out.println(", то ему можно кататься без сопровождения родителей");
        }
        System.out.println("Task 6");
        int passengerNumber = 103;
        if (passengerNumber <= 102) {
            System.out.println("Заходите! В вагоне еще поместится " + (102 - passengerNumber) + " пассажиров");
            if (passengerNumber <= 60) {
                System.out.println("Вам доступно сидячее место!");
            }
            if (passengerNumber > 60 && passengerNumber <= 102) {
                System.out.println("Вам доступно стоячее место, к сожалению, все сидячие заняты!");
            }
        } else {
            System.out.println("Мест больше нет!");
        }
        System.out.println("Task 7");
        int one = 3001;
        int two = 3000;
        int three = 300;

        if (one > two && three > two) {
            System.out.println("Число two со значением " + two + " - самое маленькое!");
            if (one > three) {
                System.out.println("Число one со значением " + one + " - самое большое!");
            } else {
                System.out.println("Число three со значением " + three + " - самое большое!");
            }
        }
        if (two > one && three > one) {
            System.out.println("Число one со значением " + one + " - самое маленькое!");
            if (two > three) {
                System.out.println("Число two со значением " + two + " - самое большое!");
            } else {
                System.out.println("Число three со значением " + three + " - самое большое!");
            }
        }
        if (two > three && one > three) {
            System.out.println("Число three со значением " + three + " - самое маленькое!");
            if (two > one) {
                System.out.println("Число two со значением " + two + " - самое большое!");
            } else {
                System.out.println("Число one со значением " + one + " - самое большое!");
            }
        }

    }
}