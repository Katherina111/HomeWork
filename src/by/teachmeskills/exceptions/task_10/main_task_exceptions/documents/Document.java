package by.teachmeskills.exceptions.task_10.main_task_exceptions.documents;

import java.util.Date;

public abstract class Document {
    protected String numberOfDocument;
    protected Date dateOfDocument;

    public Document() {
    }

    public Document(String numberOfDocument, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public String getNumberOfDocument() {
        return numberOfDocument;
    }

    public abstract String getInfo();
}