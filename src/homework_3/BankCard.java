package homework_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankCard {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String bankName;
    private String cardOrigin;
    private String nameOnCard;
    private String cardNumber;
    private Date expireDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName,
                    String cardOrigin,
                    String nameOnCard,
                    String cardNumber,
                    Date expireDate,
                    String cvv) {
        this.bankName = bankName;
        this.cardOrigin = cardOrigin;
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.balance = 0d;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void addFunds(double value) {
        this.balance += value;
    }

    public String toString() {
        return "{" + bankName + " " +
                cardOrigin + " " +
                nameOnCard + " " +
                cardNumber + " " +
                simpleDateFormat.format(expireDate) + " " +
                cvv + " " +
                +balance + "}";
    }


}
