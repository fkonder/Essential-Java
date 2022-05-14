import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyList<String> sehirler = new MyList<>();
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        // sehirler.add(1);  Generic type'dan hata verir.

        MyList<Customer> customerMyList = new MyList<>();
        customerMyList.add(new Customer());
        customerMyList.add(new Customer());

    }
}