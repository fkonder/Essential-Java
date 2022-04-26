public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.set_name("Laptop");
        product.setId(1);
        product.set_description("Acer Laptop");
        product.set_price(5000);
        product.set_stockMount(10);
        product.getId();

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("\n\n" + product.get_name() + " " + product.get_description() + " " + product.get_price() + " " + product.get_stockMount());


    }

}

