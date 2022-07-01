package localClassExaple;

public class SendMoney {
    public void sendByCard(double amount, Long cardNumber, Integer cvc, String expiryDate) {


        class SwedBankData {
            double amount;
            Long cardNumber;
            Integer cvc;
            String expiryDate;
            String secretKey;
        }

        SwedBankData transactionData = new SwedBankData();
        transactionData.amount = amount;
        transactionData.cardNumber = cardNumber;
        transactionData.cvc = cvc;
        transactionData.expiryDate = expiryDate;
        transactionData.secretKey = "jtgb45ag3oj01";

        //SwedBankData response = swedBankLib.processTransaction(transactionData);

    }
}
