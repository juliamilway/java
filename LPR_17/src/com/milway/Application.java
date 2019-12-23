package com.milway;

import java.util.Arrays;
import java.util.Scanner;

    /*ЗАВДАННЯ 2. Написати консольну програму для роботи з Enum.
    Створити enum Seasons (пори року), в якому оголосити такі константи: Зима , Весна, Літо, Осінь.
    Створити enum Months, в якому створити 12 констант  –  місяці року(Січень , Лютий, ..., Грудень ),
    оголосити змінну days (дні), та змінну season (пора року) типу Seasons, як поле enum.
    Створити конструктор iз визначеними параметрами в enum Months, в який як параметри передати змінну days та season.
    Описати getters до даних полів (дні, сезони). Створити консольне меню, в якому реалізувати наступні пункти:

Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим —
використати до зчитаного рядка метод toUpperCase() )

2.Вивести всі місяці з такою ж порою року
3.Вивести всі місяці, які мають таку саму кількість днів
4.Вивести на екран всі місяці, які мають меншу кількість днів
5.Вивести на екран попередню пору року (пору року вводити з клавіатури).
6.Вивести на екран наступну пору року (пору року вводити з клавіатури).
7.Вивести на екран всі місяці, які мають більшу кількість днів
8.Вивести на екран всі місяці, які мають парну кількість днів
9.Вивести на екран всі місяці, які мають непарну кількість днів
10.Вивести на екран чи введений з консолі місяць має парну кількість днів.*/

    public class Application {
        //функція, що виводить пункти меню (ДОБАВИТІ ПУНКТИ ВІДСУТНІ ПУНКТИ МЕНЮ)
        static void menu() {
            System.out.println("Для вібору пункту меню, введіть відповідно його номер:");
            System.out.println(
                    "1. Перевірити чи є такий місяць (місяць вводимо в консолі, передбачити, щоб регістр літер був не " +
                            "важливим.\n"
                            + "2. Вивести всі місяці з такою ж порою року \n"
                            + "3. Вівести всі місяці, які мають таку саму кількість днів \n"
                            + "4. Вивести на екран всі місяці, які мають меншу кількість днів \n"
                            + "5. Вивести на екран попередню пору року \n"
                            + "6. вивести на екран наступну пору року \n"
                            + "7. Вивести на екран всі місяці, які мають більшу кількість днів \n"
                            + "8. Вивести на екран всі місяці які мають парну кількість днів \n"
                            + "9. Вивести на екран всі місяці, які мають непарну кількість днів \n"
                            + "10. Вивести на екран чи введений з консолі місяць має парну кількість днів\n"
                            + "Exit будь-яка кнопка");
        }

        //Функція, що преревіряє чи є значення рядка month одним із значень enum Months
        public static boolean isMonthPresent(Months[] masMonths, String month) {
            boolean flag = false;
            for (Months m : masMonths) {
                if (m.name().equals(month)) {
                    System.out.println("There is such a month");
                    flag = true;
                }
            }
            return flag;
        }

        public static void main(String[] args) {
            Months [] masMonths = Months.values();
            Seasons [] masSeasons = Seasons.values();
            Scanner sc = new Scanner(System.in);
            while (true) {
                menu();
                switch (sc.next()) {
                    case "1": {
                        System.out.println("Input month:");
                        String month = sc.next().toUpperCase();
                        boolean flag = isMonthPresent(masMonths, month);
                        if (!flag) {
                            System.out.println("Month is not exist");
                        }
                        break;
                    }
//                    case "2": {
//                        System.out.println("Input season:");
//                        String season = sc.next().toUpperCase();
//                        boolean flag = false;
//                        for (Months m : masMonths) {
//                            if (m.getSeason().name().equals(season)) {
//                                flag = true;
//                            }
//                        }
//                        if (flag) {
//                            for (Months m : masMonths) {
//                                if (m.getSeason().toString().equals(season)) {
//                                    System.out.println(m);
//                                }
//                            }
//                            if (!flag) {
//                                System.out.println("Season not exist");
//                            }
//                        }
//                        break;
//                    }
                    case "2": {
                        System.out.println("Input month:");
                        String month = sc.next().toUpperCase();
                        boolean flag = false;
                        for (Months m : masMonths) {
                            if (m.name().equals(month)) {
                                flag = true;
                            }
                        }
                        System.out.println("Flag "+flag);
                        if (flag) {
                            Months monthsenum = Months.valueOf(month);
                            System.out.println("Season is: "+monthsenum.getSeason());
                            }
                            if (!flag) {
                                System.out.println("Month not exist");
                            }

                        break;
                    }

                    case "3": {
                        System.out.println("Input count days:");
                        int day = sc.nextInt();
                        boolean flag = false;
                        for (Months m : masMonths) {
                            if (m.getDays() == day) {
                                System.out.println(m);
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Month not exist with "+day+" days");
                        }
                        break;
                    }
                    case "4": {
                            System.out.println("Input count days:");
                            int day = sc.nextInt();
                            boolean flag = false;
                            for (Months m : masMonths) {
                                if (m.getDays() < day) {
                                    System.out.println(m);
                                    flag = true;
                                }
                            }
                            if (!flag) {
                                System.out.println("Month not exist that is less "+day+" days.");
                            }
                        break;
                    }
                    case "5": {
                        System.out.println("Input season:");
                        String season = sc.next().toUpperCase();
                        boolean flag = false;

                        for (Seasons m : masSeasons) {
                            if (m.name().equals(season)) {
                                flag = true;
                            }
                        }
                        if (flag) {
                            Seasons season2 = Seasons.valueOf(season);
                            int ordinal = season2.ordinal();
                            if (ordinal == 0) {
                                ordinal = masSeasons.length-1;
                            } else {
                                ordinal-=1;
                            }
                            System.out.println("Previous season: "+masSeasons[ordinal]);
                        }
                        if (!flag) {
                            System.out.println("Season not exist");
                        }
                        break;

                    }
                    case "6": {
                        System.out.println("Input season:");
                        String season = sc.next().toUpperCase();
                        boolean flag = false;

                        for (Seasons m : masSeasons) {
                            if (m.name().equals(season)) {
                                flag = true;
                            }
                        }
                        if (flag) {
                            Seasons season2 = Seasons.valueOf(season);
                            int ordinal = season2.ordinal();
                            if (ordinal == masSeasons.length-1) {
                                ordinal = 0;
                            } else {
                                ordinal+=1;
                            }
                            System.out.println("Next season: "+masSeasons[ordinal]);
                        }
                        if (!flag) {
                            System.out.println("Season not exist");
                        }
                        break;
                    }
                    case "7": {
                        System.out.println("Input count days:");
                        int day = sc.nextInt();
                        boolean flag = false;
                        for (Months m : masMonths) {
                            if (m.getDays() > day) {
                                System.out.println(m);
                                flag = true;
                            }
                        }
                        if (!flag) {
                            System.out.println("Month not exist that is less "+day+" days.");
                        }
                        break;
                    }
                    case "8": {
                        System.out.println("Month with an even number of days");
                        for (Months m : masMonths) {
                            if (m.getDays() %2 == 0) {
                                System.out.println(m);
                            }
                        }
                        break;
                    }
                    case "9": {
                        System.out.println("Month with an odd number of days");
                        for (Months m : masMonths) {
                            if (m.getDays() % 2 != 0) {
                                System.out.println(m);
                            }
                        }
                        break;
                    }

                    case "10": {
                        System.out.println("Input month:");
                        String month = sc.next().toUpperCase();
                        boolean flag = isMonthPresent(masMonths, month);
                        if (flag) {
                            if (Months.valueOf(month).getDays()%2==0) {
                                System.out.println(month+" with an even number of days");
                            } else  {
                                System.out.println(month+" with an odd number of days");
                            }
                        } else {
                            System.out.println("Months not exist");
                        }
                        break;
                    } default:
                        System.exit(0);
                }
            }
        }

    }