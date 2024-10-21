import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Monster Tulpar";
        product.id = 1;
        product.price = 100000;

        ProductManager productManager = new ProductManager();
        productManager.add(product);



        DatabaseHelper.Connectoin.CreateConnection.oracle();
        DatabaseHelper.Connectoin.Disconnection.oracle();
    }
}