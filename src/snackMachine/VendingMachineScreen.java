package snackMachine;

public class VendingMachineScreen implements VendingMachineInterface {

    private Calculator calculator = new Calculator();
    private int selectedProduct;
    private MoneyBundle change;
    public Product product;
    public MoneyBundle enteredCoins;
    //public int totalChange;
    

    @Override
    public void displayProducts() {
        System.out.println("\n           SNACK VENDING MACHINE          ");
        System.out.println("<><><><><>.......................<><><><><>");
        System.out.println("\n  PRODUCTS AVILABLE:\n");
        System.out.println("\t   Product: Price\n");
        
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("\t" + product.getSelectionNumber() + ". " + product.name() + ": " + product.getPrice());
            }
        }
        System.out.println("...........................................\n");
        System.out.print(" Please Enter your product number: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }
    

    @Override
    public void displayEnterMoneyMessage() {
        System.out.println("Enter coins as: (5cents, 10cents, 20cents, 50cents, 100cents) ");
        System.out.println("\tExample  => (0,0,1,0,0) / if you want to pay with two 20's => (0,0,2,0,0) ");
        System.out.print("\tEnter Your Coins: ");
    }

    @Override
    public void enterCoins(int... coins) {
        product = Product.valueOf(this.selectedProduct);
        enteredCoins = new MoneyBundle(coins);
        int total = calculator.calculateTotal(enteredCoins);
        int totalChange = total - product.getPrice();
        change = calculator.calculateChange(totalChange);  
    }

    @Override
    public void displayChangeMessage() {
        product = Product.valueOf(this.selectedProduct);
        int returendValue = change.getTotal();
        if(returendValue > 0) {
                System.out.println("\n\tYour Change is = " + (returendValue)  +", Successful!");
                System.out.println("\tThe change splited as:");
                System.out.println("\t100 cents coins: "+ change.number100CentsCoins);
                System.out.println("\t50 cents coins: "+ change.number50CentsCoins);
                System.out.println("\t20 cents coins: "+ change.number20CentsCoins);
                System.out.println("\t10 cents coins: "+ change.number10CentsCoins);
                System.out.println("\t5 cents coins: "+ change.number5CentsCoins);
            }else if(returendValue == 0) {
                System.out.println("\n\tYour Change is= " + (returendValue) + ", Successful!");

            }else {
                System.out.println("\n\tMoney not enough!");
            }
        }
}





    