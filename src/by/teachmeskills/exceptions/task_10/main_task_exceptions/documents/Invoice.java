package by.teachmeskills.exceptions.task_10.main_task_exceptions.documents;

import java.util.Date;

public class Invoice extends Document {

    private String departmentCode;
    private int finalMonthSum;

    public Invoice() {
    }

    public Invoice(String numberOfDocument, Date dateOfDocument, String departmentCode, int finalMonthSum) {
        super(numberOfDocument, dateOfDocument);
        this.departmentCode = departmentCode;
        this.finalMonthSum = finalMonthSum;
    }

    @Override
    public String getInfo() {
        return "Invoice № " + numberOfDocument + " of " + dateOfDocument + ". " + "Department: " + departmentCode
                + ". Total: " + finalMonthSum;
    }
}
