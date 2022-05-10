public class Main {
    public static void main(String[] args) {
        
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
        ICustomerDal customerDal1 = new MySqlCustomerDal();
        customerDal1.add();

    }
}