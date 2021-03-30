public class ATMCard implements CheckCard {
    private String bankName;
    private int cardPIN;

    public ATMCard(String bankName, int cardPIN) {
        this.bankName = bankName;
        this.cardPIN = cardPIN;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public int insertPIN() {
        return cardPIN;
    }
}
