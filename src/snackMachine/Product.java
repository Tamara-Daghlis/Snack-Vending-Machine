package snackMachine;

public enum Product {
    COOKIES(1,15), SNICKERS(2,10), CHIPS(3,50), PATCHI(4,120), HAZELNUT(5,100), EMPTY(0,0);

    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber(){
        return selectionNumber;
    }

    public int getPrice(){
        return this.price;
    }

    public static Product valueOf(int numberSelected){
        for(Product product: Product.values()){
            if(numberSelected == product.getSelectionNumber()){
                return product;
            }
        }
        return EMPTY;
    }    
    
}
