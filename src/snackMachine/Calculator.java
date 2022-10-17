package snackMachine;

public class Calculator implements CalculatorInterface{

    @Override
    public int calculateTotal(MoneyBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public MoneyBundle calculateChange(int amountMoneyToReturn) {
    	MoneyBundle change = new MoneyBundle(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.number100CentsCoins = remainingAmount / Money.HUNDRED_CENTS.getValue();
        remainingAmount = remainingAmount % Money.HUNDRED_CENTS.getValue();

        change.number50CentsCoins = remainingAmount / Money.FIFTY_CENTS.getValue();
        remainingAmount = remainingAmount % Money.FIFTY_CENTS.getValue();

        change.number20CentsCoins = remainingAmount / Money.TWENTY_CENTS.getValue();
        remainingAmount = remainingAmount % Money.TWENTY_CENTS.getValue();

        change.number10CentsCoins = remainingAmount / Money.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % Money.TEN_CENTS.getValue();

        change.number5CentsCoins = remainingAmount / Money.FIVE_CENTS.getValue();


        return change;
    }
}
