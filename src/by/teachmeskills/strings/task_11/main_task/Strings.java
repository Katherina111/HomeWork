package by.teachmeskills.strings.task_11.main_task;

public class Strings {
    public static final String EMPTY = "";

    public static void printFirstTwoBlocksWithFourNumbers(String doc) {
        String[] blocks = doc.split("-");
        System.out.println("Выведем два первых блока по 4 цифры: " + blocks[0] + blocks[1]);
    }

    public static void printBlocksWithThreeLetters(String doc) {
        String[] blocks = doc.split("-");
        String s = blocks[1].replaceAll("ccc", "***");
        System.out.println("Заменим блок " + blocks[1] + " на " + s);
    }

    public static void printOnlyLetterWithLow(String doc) {
        String s = doc.replaceAll("\\d{4}-|\\d", EMPTY);
        s = s.replaceAll("-", "/");
        s = new StringBuilder(s).insert(s.length() - 1, "/").toString();
        System.out.println("Выведем только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре: " +
                s.toLowerCase());
    }

    public static void printOnlyLetterWithUp(String doc) {
        String s = doc.replaceAll("\\d{4}-|\\d", EMPTY);
        s = s.replaceAll("-", "/");
        s = new StringBuilder(s).insert(s.length() - 1, "/").toString();
        System.out.println("Номер документа: \"Letters:" + s.toUpperCase());
    }

    public static boolean containsAbc(String doc) {
        if (doc.toLowerCase().contains("abc")) {
            System.out.println("Документ содержит \"abc\"");
            return true;
        } else {
            System.out.println("Документ не содержит \"abc\"");
            return false;
        }
    }

    public static boolean contains555(String doc) {
        if (doc.toLowerCase().contains("555")) {
            System.out.println("Документ содержит \"555\"");
            return true;
        } else {
            System.out.println("Документ не содержит \"555\"");
            return false;
        }
    }

    public static boolean contains1a2b(String doc) {
        if (doc.toLowerCase().contains("1a2b")) {
            System.out.println("Документ содержит \"1a2b\"");
            return true;
        } else {
            System.out.println("Документ не содержит \"1a2b\"");
            return false;
        }
    }
}