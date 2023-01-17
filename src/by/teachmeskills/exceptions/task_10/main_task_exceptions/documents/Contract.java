package by.teachmeskills.exceptions.task_10.main_task_exceptions.documents;

import java.util.Date;

public class Contract extends Document {
    private String goodsType;
    private int goodsCount;

    public Contract() {
    }

    public Contract(String numberOfDocument, Date dateOfDocument, String goodsType, int goodsCount) {
        super(numberOfDocument, dateOfDocument);
        this.goodsType = goodsType;
        this.goodsCount = goodsCount;
    }

    @Override
    public String getInfo() {
        return goodsType + " Supply Contract № " + numberOfDocument + " of "  + dateOfDocument + ". " + "Amount: "
                + goodsCount;
    }
}
