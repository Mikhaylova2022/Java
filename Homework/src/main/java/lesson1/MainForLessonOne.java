package lesson1;

import java.util.random.RandomGeneratorFactory;

public class MainForLessonOne {

    public static void main(String[] args) {

       /* System.out.println("Отличный день.");
        System.out.println("Сегодня 1 ноября");
        printHello();*/

        //testVars();

        checkAppraisal();
        
    }





    private static void testVars() {
              int varA = 9;
              int varB;
        varB = 5;
        System.out.println(varA + varB);
        System.out.println(varA * varB);
        System.out.println(1.0 * varA / varB);
         double varDoubleA =  9.1;
         double varDoubleB = 5;
        System.out.println(varDoubleA / varDoubleB);

        char chr1 = '♦';
        char chr2 = 1256;
        System.out.println(chr1);
        System.out.println(chr2);
        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + ", " + worldStr + "!");

    }

    static void printHello() {

        System.out.println("На улице солнечная погода.");
        System.out.println("Это последний месяц осени ∆");
    }
    private static void checkAppraisal() {
        int appraisal = 2;

        if (appraisal == 5) {
            System.out.println("Молодец!Так держать!");
        }
    }
}
