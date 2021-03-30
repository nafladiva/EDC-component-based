public class BillPrinter {
    private PrintOutput bill;

    public BillPrinter() {
        bill = null;
    }

    public void detectPayment(PrintOutput bill) {
        this.bill = bill;
    }

    public void printBill() {
        if (bill != null) {
            System.out.println(bill.setOutput());
        } else {
            System.out.println("Error!");
        }
    }
}
