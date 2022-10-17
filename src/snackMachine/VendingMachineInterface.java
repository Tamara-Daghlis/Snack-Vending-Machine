package snackMachine;

public interface VendingMachineInterface {

    void displayProducts();
    void selectProduct(int product);
    void displayEnterMoneyMessage();
    void enterCoins(int... coins);
    void displayChangeMessage();
}

