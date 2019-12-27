package com.milway;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //ЗАВДАННЯ 1. Написати програми, що реалізують алгритми розв'язку наступних задач:
    //
    //Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем,
    // паліндромом (приклади: «пилип», «ротор»).
    // Якщо введено слово не з 5 букв, то повідомляти про помилку.
    // Програма повинна нормально обробляти слово, навіть якщо в ньому використані символи різного регістра.
    // Наприклад, слова «Комок» або «РОТОР» слід також вважати паліндромами.
    //Замініть всі голосні букви в тексті на тире ('-').
    //Знайти слово яке найчастіше зустрічається в реченні.
    //Порахувати кількість слів у реченні.

    public static void main (String[] args) {
        //Task 1:

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the word. Declaire if it is polindrome");
//        String s7;
//        s7 = in.next();
//        StringBuffer palindrome = new StringBuffer();
//        palindrome.append(s7);
//        System.out.println(palindrome);
//
//        StringBuffer polindrome2=new StringBuffer(palindrome.reverse());
//        String s8=polindrome2.toString();
//        System.out.println(polindrome2);
//        System.out.println(s7.toUpperCase().intern().equals(s8.toUpperCase()));
        System.out.println (maxCountWords ());

//        if (palindrome.length() <= 5) {
//            if (s7.toUpperCase().equals(s8.toUpperCase())){
//            System.out.println(palindrome + " is polindrome!");
//        } else {
//            System.out.println(palindrome + " Not is polindrome!");
//        }
//            } else {
//            System.out.println(palindrome + " is more then 5 symbols!");
//        }
//        ///////////////////////////////////////////////////////////////////////////////////////////////
//        //Task 2:
//        System.out.println("Enter any kind of word:");
//        String vowels=in.next();
//        char[] charArray = vowels.toCharArray();
//        for (int i=0; i<charArray.length; i++){
//            if (charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u'||
//                    charArray[i]=='y'){
//                charArray[i]='-';
//            }
//        }
//        System.out.println(Arrays.toString(charArray));
//}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //Task 4(a):
//public static int randomInteger (int a, int b) {
//    if (a > b) {
//        int c = (int) (Math.random () * (a - b)) + b;
//        return c;
//    } else {
//        int c = (int) (Math.random () * (b - a)) + a;
//        return c;
//    }
//}
//////////////////////////////////////////////////////////////////////////////////////////
        //Task 4(b):
//    public static int countWords() {
//        Scanner in = new java.util.Scanner (System.in);
//        System.out.println ("Enter the text");
//        String s1 = in.nextLine ();
//        int countWords = 0;
//        int count = 0;
//        for (String element : s1.split (" ")) {
//            if (element.length () >= 2) {
//                countWords++;
//                countWords += s1.length ();
//            }
//        }
//
//        return countWords;
        // }
        ////////////////////////////////////////////////////////////////////////////////////////
        //Task 3:
    }
        public static String maxCountWords () {
            Scanner in = new java.util.Scanner (System.in);
            System.out.println ("Enter the text");
            String s = in.nextLine ();
            int maxCount = 0;
            String maxWord = " ";
            for (String word : s.split (" ")) {
                int countwords = 0;
                for (String wordNext : s.split (" ")) {
                    if (wordNext.equals (word)) {
                    }
                    countwords++;
                }
                if (countwords > maxCount) {
                    maxCount = countwords;
                    maxWord = word;
                }
            }
            return maxWord;
        }

    }
