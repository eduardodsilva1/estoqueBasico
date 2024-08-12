package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
    public int addProducts(int quantity) {
        return this.quantity += quantity;
    }
    public int removeProducts(int quantity) {
        return this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return '\n' +
                "NOME= " + name + '\n' +
                "VALOR= R$ " + String.format("%.2f", price) + '\n' +
                "QUANTIDADE= " + quantity + '\n' +
                "TOTAL= R$ " + String.format("%.2f", totalValueInStock());
    }
}
