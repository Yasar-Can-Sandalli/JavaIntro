public class ProductValidator {

    static {
        System.out.println("static yapici blok calisti");
    }

    public ProductValidator(){
        System.out.println("Yapici Blok Calisti");
    }

    public static boolean isValid(Product product) {

        if ((product.price > 0 && product.name != null) && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void bisey(){

    }
}
