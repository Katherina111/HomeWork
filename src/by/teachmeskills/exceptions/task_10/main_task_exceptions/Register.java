package by.teachmeskills.exceptions.task_10.main_task_exceptions;

import by.teachmeskills.exceptions.task_10.main_task_exceptions.documents.Document;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.Exception1a1b;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.Exception555;
import by.teachmeskills.exceptions.task_10.main_task_exceptions.exceptions.ExceptionABC;

public class Register {
    private static final int REGISTER_SIZE = 10;
    private int docsInRegister;

    private Document[] register;

    public Register() {
        this.register = new Document[REGISTER_SIZE];
    }

    /*
    Проверить содержит ли номер документа последовательность abc.
    Проверить начинается ли номер документа с последовательности 555.
    Проверить заканчивается ли номер документа на последовательность 1a2b.
     */
    public void saveDocument(Document documents) throws ExceptionABC, Exception555, Exception1a1b {
        if (documents.getNumberOfDocument().contains("abc")) {
            throw new ExceptionABC("Number of document contains \"abc\"!");
        }
        if (documents.getNumberOfDocument().startsWith("555")) {
            throw new Exception555("Number of document contains \"555\"!");
        }
        if (documents.getNumberOfDocument().endsWith("1a2b")) {
            throw new Exception555("Number of document contains \"1a2b\"!");
        }
        if (docsInRegister < REGISTER_SIZE) {
            register[docsInRegister] = documents;
            docsInRegister++;
        } else {
            System.out.println("Register is full");
        }
    }

    public void getDocumentInfo(String documentOfNumber) {
        for (Document documents : register) {
            if (documentOfNumber.equals(documents.getNumberOfDocument())) {
                System.out.println(documents.getInfo());
                return;
            }
        }
        System.out.println("Document was not found!");
    }
}
