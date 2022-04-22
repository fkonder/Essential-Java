
public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1,2,9,5,6,4,9,31,49};
        int arananSayi = 5;
        boolean sayiVar = false;


        for(int sayi :sayilar){
            if(sayi == arananSayi){
                sayiVar = true;
                break;
        }}
        if(sayiVar)
            mesajVer("Sayı dizide var!\n" + "Aranan sayı: " + arananSayi);
        else
            mesajVer("Sayı dizide var!\n" + "Aranan sayı: " + arananSayi);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }

}
