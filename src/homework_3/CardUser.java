package homework_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CardUser {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        BankCard myCard = new BankCard(
                "Bank Swedbank",
                "Visa",
                "Eriks Rizankovs",
                "123456789",
                sdf.parse("22/12/2026"),
                "556");

        System.out.println("Karte" + myCard);

        myCard.addFunds(100d);

        System.out.println("Karte" + myCard);

        myCard.withdraw(20d);

        System.out.println("Karte" + myCard);

    }
}
