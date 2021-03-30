import java.lang.Thread;
import java.util.Random;

public class EDC implements PrintOutput {
    private CheckCard atmCard;

    public EDC() {
        this.atmCard = null;
    }

    public void detectCard(CheckCard atmCard) {
        this.atmCard = atmCard;
        System.out.println("Pembayaran dengan kartu atm " + atmCard.getBankName());
    }

    public void process() throws InterruptedException {
        if (atmCard != null) {
            atmCard.insertPIN();
            System.out.println("PIN berhasil dimasukkan!");
            System.out.println("Memproses pembayaran...");
            Thread.sleep(2000);
        } else {
            System.out.println("Kartu ATM tidak dapat diproses!");
        }
    }

    public int getTransactionNum() {
        return new Random().nextInt(1000);
    }

    @Override
    public String setOutput() {
        return "Pembayaran dengan nomor transaksi " + getTransactionNum() + " berhasil!";
    }
}
