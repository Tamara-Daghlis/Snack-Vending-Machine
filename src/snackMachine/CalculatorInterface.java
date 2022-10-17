package snackMachine;

public interface CalculatorInterface {
    int calculateTotal(MoneyBundle enteredCoins);
    MoneyBundle calculateChange(int enteredByUserMoney);
}
