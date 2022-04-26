public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Acer",3000,10);

        /*product.set_name("Laptop");
        product.setId(1);
        product.set_description("Acer Laptop");
        product.set_price(5000);
        product.set_stockMount(10);
        product.get_id();*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("\n\n" + product.get_name() + " " + product.get_description() + " " + product.get_price() + " " + product.get_stockMount());


    }

}

