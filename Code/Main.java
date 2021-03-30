public class Main {
    public static void main(String[] args) {
        ATMCard bankBRI = new ATMCard("Bank BRI", 123456);

        EDC transaction = new EDC();
        transaction.detectCard(bankBRI);
        try {
            transaction.process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BillPrinter billPrinter = new BillPrinter();
        billPrinter.detectPayment(transaction);
        billPrinter.printBill();
    }
}
