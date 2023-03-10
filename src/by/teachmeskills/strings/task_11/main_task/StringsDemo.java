package by.teachmeskills.strings.task_11.main_task;
/*
Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
//Вывести на экран в одну строку два первых блока по 4 цифры.
Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC
считается одинаковой последовательностью).
Проверить начинается ли номер документа с последовательности 555.
Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут
принимать вводимую на вход программы строку.
 */
public class StringsDemo {
    public static void main(String[] args) {
        //Исходный документ
        final String doc = "5552-ccc-1478-ABC-m0r1";

        //Вывести на экран в одну строку два первых блока по 4 цифры.
        Strings.printFirstTwoBlocksWithFourNumbers(doc);

        //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        Strings.printBlocksWithThreeLetters(doc);

        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        Strings.printOnlyLetterWithLow(doc);

        /*Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с
        помощью класса StringBuilder).
        */
        Strings.printOnlyLetterWithUp(doc);

        //Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет
        // (причем, abc и ABC считается одинаковой последовательностью).
        Strings.containsAbc(doc);

        //Проверить начинается ли номер документа с последовательности 555.
        Strings.contains555(doc);

        //Проверить заканчивается ли номер документа на последовательность 1a2b.
        Strings.contains1a2b(doc);
    }

}
