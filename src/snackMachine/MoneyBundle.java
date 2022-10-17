package snackMachine;

public class MoneyBundle {
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public MoneyBundle(int... enteredCoins) {
        this.number5CentsCoins = enteredCoins[0];
        this.number10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];

    }

    public int getTotal(){
        int total = 0;
        total = total+this.number5CentsCoins*Money.FIVE_CENTS.getValue();
        total = total+this.number10CentsCoins*Money.TEN_CENTS.getValue();
        total = total+this.number20CentsCoins*Money.TWENTY_CENTS.getValue();
        total = total+this.number50CentsCoins*Money.FIFTY_CENTS.getValue();
        total = total+this.number100CentsCoins*Money.HUNDRED_CENTS.getValue();
        return total;
    }
}

