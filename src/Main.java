public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +  age + ", то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " +  age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperaure = 4;
        if (temperaure >= 5) {
            System.out.println("На улице " + temperaure + " градусов, можно идти без шапки");
        }

        if (temperaure < 5) {
            System.out.println("На улице " + temperaure + " градусов,  нужно надеть шапку");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (age > 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 18;
        if (age <  5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
            } else {
                if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int passengers = 67;
        int totalSeats;

        if (passengers >= 0 && passengers <= 60) {
            totalSeats = 60 - passengers;
            if (totalSeats == 0) {
            System.out.println("Есть только стоячие места в вагоне: 42 места");
            } else {
                System.out.println("Есть стоячие места в вагоне: 42, есть места для сидения: " + totalSeats);
            }
        } else {
            if (passengers > 60 && passengers <= 102) {
                totalSeats = 102 - passengers;
                if (totalSeats == 0) {
                    System.out.println("Все места заняты");
                } else {
                    System.out.println("Есть только стоячие места в вагоне: " + totalSeats);
                }
            } else {
                if (passengers > 102) {
                    System.out.println("Вагон переполнен, мест нет");
                }

            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 40;
        int two = 90;
        int three = 70;
        int max;
        boolean flag;

        flag = true;
        if (one < two) {
            max = two;
            flag = false;
        } else {
            max = one;
        }
        if (max < three){
            max = three;
            System.out.println("Самое большое число three = " + three);
        } else {
            if (flag == false) {
                System.out.println("Самое большое число two = " + two);
            }
            if (flag == true) {
                System.out.println("Самое большое число one = " + one);
            }
        }
    }

}
