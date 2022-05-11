import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("apple","elma");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk.get("table"));
        System.out.println(sozluk.get("apple"));
        System.out.println(sozluk.size());
        System.out.println("***********************************");



        sozluk.remove("table");
        System.out.println(sozluk.get("table"));

        //sozluk.clear();
        //System.out.println(sozluk);
        System.out.println("***********************************");
        for(String item: sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

    }
}