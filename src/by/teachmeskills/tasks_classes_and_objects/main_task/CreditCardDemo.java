package by.teachmeskills.tasks_classes_and_objects.main_task;

public class CreditCardDemo {
    public static void main(String[] args) {
/*
Основное задание № 1

CreditCard
Создать класс CreditCard c полями:
    номер счета
    текущая сумма на счету
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Написать программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма

Тестовый сценарий для проверки:
    Положите деньги на первые две карточки и снимите с третьей.
    Выведите на экран текущее состояние всех трех карточек.
 */

        // Написать программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
        CreditCard cardOne = new CreditCard("BY11BYBYBY12345", 500);
        CreditCard cardTwo = new CreditCard("BY11MYMYMY11111", 100);
        CreditCard cardThree = new CreditCard("BY11KYKYKY33333", 850);

        // Положим деньги на первые две карточки и снимите с третьей
        cardOne.sumAdd(10);
        cardTwo.sumAdd(100);
        cardThree.sumWithdr(50);

        // отобразить текущее состояние со всех карт
        cardOne.sumInfo();
        cardTwo.sumInfo();
        cardThree.sumInfo();

    }
}
