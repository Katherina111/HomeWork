package by.teachmeskills.tasks_classes_and_objects.main_task;
public class CreditCard {

/*
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

    private String numberAccount;
    private double currentCountOnAccount;

    public CreditCard(String numberAccount, double currentCountOnAccount) {
        this.numberAccount = numberAccount;
        this.currentCountOnAccount = currentCountOnAccount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getCurrentCountOnAccount() {
        return currentCountOnAccount;
    }

    public void setCurrentCountOnAccount(double currentCountOnAccount) {
        this.currentCountOnAccount = currentCountOnAccount;
    }

    // метод, который позволяет начислять сумму на кредитную карточку
    public void sumAdd(double sumtoAdd) {
        this.currentCountOnAccount += sumtoAdd;
    }

    // метод, который позволяет списывать сумму с кредитной карточки
    public void sumWithdr(double sumToWithdrowal) {
        if (sumToWithdrowal <= this.currentCountOnAccount) {
            this.currentCountOnAccount -= sumToWithdrowal;
        }
        else {
            System.out.println("Операция недоступна. Недостаточно количества средств");
        }
    }

    // метод, который выводит текущую информацию о карточке.
    public void sumInfo() {
        System.out.println("Текущая сумма: " + this.currentCountOnAccount + " рублей на кредитном счете: " + this.numberAccount);
    }
}
