public class Product {
    //antribute | field
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Yapıcı blok çalıştı!");
        this._id=id;
        this._name=name;
        this._description=description;
        this._price=price;
        this._stockMount=stockAmount;
    }
    private String _name;
    private String _description;
    private double _price;
    private int _stockMount;
    private int _id;

    //getter

    //setter
    public void setId(int id) {
        set_id(id);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockMount() {
        return _stockMount;
    }

    public void set_stockMount(int stockMount) {
        this._stockMount = stockMount;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }
}
