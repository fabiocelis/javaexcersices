package entities;

public class ImportedProduct extends Product {

    Double customFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double totalPrice() {
        return getPrice() + customFee;
    }

    public String priceTag() {
        return getName() + " $ " + String.format("%.2f",totalPrice()) + " (Custom fee: $ " + String.format("%.2f", customFee) + ")";
    }
}
