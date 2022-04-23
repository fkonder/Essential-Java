public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonucCıkartma = dortIslem.Cıkar(5,2,3,4,5);
        int sonucToplam = dortIslem.Topla(4,3,16,3,5);
        int sonucBolme = dortIslem.Bol(3,2);
        int sonucCarpma = dortIslem.Carp(3,1,2,9,19,0);
        System.out.println(sonucToplam + "\n" +sonucCıkartma + "\n" + sonucCarpma + "\n" + sonucBolme);
    }
}
