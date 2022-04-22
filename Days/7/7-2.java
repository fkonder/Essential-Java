import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int toplandı = topla(5,26);
        System.out.println(toplandı);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
}
