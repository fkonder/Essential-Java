public class DortIslem {
    public int Topla(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public int Cıkar(int... sayilar){
        int toplam = sayilar[0];
        for(int sayi:sayilar){
            toplam-=sayi;
        }
        return toplam;
    }
    public int Bol(int sayi1, int sayi2){
        return sayi1/sayi2;
    }
    public int Carp(int... sayilar){
        int toplam = sayilar[0];
        for(int sayi:sayilar){
            toplam*=sayi;
        }
        return toplam;
    }

}
