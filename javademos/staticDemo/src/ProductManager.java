public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Ekelendi");
        }else {
            System.out.println("Urun bilgilerinde eksiklik var eklenemedi");
        }

    }
}
