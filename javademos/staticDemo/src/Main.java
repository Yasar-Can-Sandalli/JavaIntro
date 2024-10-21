import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        DatabaseHelper.Connectin.oracle();

        Product product = new Product();
        product.name = "Macbook Pro";
        product.price = 100000;
        product.id = 1;



        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DatabaseHelper.Crud.Update();

        DatabaseHelper.Disconnectin.oracle();


    }
}