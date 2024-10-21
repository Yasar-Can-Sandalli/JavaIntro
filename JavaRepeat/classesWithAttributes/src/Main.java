public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "  Pro", "2024 Macbook Pro 16 inch M3 MAX chip 18GB RAM  1TB SSD", 100000, 12, "Uzay Siyahı");
        product.setId(1);
        product.setName("Macbook Pro");
        product.setPrice(100000);
        product.setDescription("2024 Macbook Pro 16 inch M3 MAX chip 18GB RAM  1TB SSD");
        product.setStockAmount(12);
        product.setColor("Uzay Siyahı");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getProductCode());

    }
}