public class ProductManager {

    public void add(Product product){
        //JDBC

        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        } else {
            System.out.println("Urun bilgileri eksik");
        }
    }
}
