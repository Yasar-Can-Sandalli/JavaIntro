public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Laptop";
        product1.id =1;
        product1.description="Monster Notebook";
        product1.stockAmount = 100;
        product1.price = 50000;
        product1.color ="";

        ProductManeger productManeger = new ProductManeger();
        productManeger.Add(product1);






    }
}