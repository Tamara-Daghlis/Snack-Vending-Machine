package snackMachine;

import java.util.Scanner; 
import snackMachine.VendingMachineScreen; 
import snackMachine.VendingMachineInterface;
import snackMachine.Product;

public class SnackMachine {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        VendingMachineScreen machineScreen= new VendingMachineScreen();
        
        machineScreen.displayProducts();

        String selectedProduct = scanner.nextLine();
        for(Product product: Product.values()){
            if(Integer.parseInt(selectedProduct) == product.getSelectionNumber()) {
                System.out.println("\t" +"- " +product.name() +" price = "+ product.getPrice() + "\n");
            }
        }

        machineScreen.displayEnterMoneyMessage();
        machineScreen.selectProduct(Integer.parseInt(selectedProduct));
        
        String userEnteredMoney = scanner.nextLine();
        int[] enteredCoins = Money.parseCoins(userEnteredMoney);
        machineScreen.enterCoins(enteredCoins);

       
        machineScreen.displayChangeMessage();

    }
}