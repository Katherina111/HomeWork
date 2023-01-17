package by.teachmeskills.exceptions.task_10.main_task_exceptions.documents;

import java.util.Date;

public class Employment extends Document{
    private String employeeName;
    private Date endDate;

    public Employment() {
    }

    public Employment(String numberOfDocument, Date dateOfDocument, String employeeName, Date endDate) {
        super(numberOfDocument, dateOfDocument);
        this.employeeName = employeeName;
        this.endDate = endDate;
    }

    @Override
    public String getInfo() {
        return "EmploymentContract № " + numberOfDocument + " of " + dateOfDocument + " with " + employeeName + ". "
                + "End date: " + endDate;
    }
}
