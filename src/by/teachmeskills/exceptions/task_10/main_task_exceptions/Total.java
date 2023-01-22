package by.teachmeskills.exceptions.task_10.main_task_exceptions;

import by.teachmeskills.exceptions.task_10.main_task_exceptions.documents.Contract;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.documents.Document;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.documents.Employment;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.documents.Invoice;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.Exception1a1b;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.Exception555;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.ExceptionABC;

import java.util.Calendar;
import java.util.Date;
public class Total {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime(); // текущая дата
        calendar.add(Calendar.YEAR, 1);
        Date nextYear = calendar.getTime(); // следующий год

        Document employment = new Employment("123", today, "Ivan Ivanov", nextYear);
        Document contract = new Contract("234", today, "Car", 300);
        Document invoice = new Invoice("333", today, "52357-DD-2023", 5500);

        /*
        Если номер документа не удовлетворяет условию - то "бросить" исключение.
        В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить исключение
        конструкцией try-catch и в блоке catch вывести сообщение для пользователя (сообщение на консоль).
         */
        Register register = new Register();
        try {
            register.saveDocument(employment);
        } catch (Exception555 | ExceptionABC | Exception1a1b exception) {
            System.out.println("An error has occurred! The document is not valid!");
        }
        try {
            register.saveDocument(contract);
        } catch (Exception555 | ExceptionABC | Exception1a1b exception) {
            System.out.println("An error has occurred! The document is not valid!");
        }
        try {
            register.saveDocument(invoice);
        } catch (Exception555 | ExceptionABC | Exception1a1b exception) {
            System.out.println("An error has occurred! The document is not valid!");
        }

        register.getDocumentInfo(employment.getNumberOfDocument());
        register.getDocumentInfo(contract.getNumberOfDocument());
        register.getDocumentInfo(invoice.getNumberOfDocument());
    }
}
