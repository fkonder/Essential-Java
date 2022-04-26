public class Product {
    //antribute | field

    private String _name;
    private String _description;
    private double _price;
    private int _stockMount;
    private int _id;

    //getter
    public int getId() {
        return get_id();
    }

    //setter
    public void setId(int id) {
        set_id(id);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = _name;
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
