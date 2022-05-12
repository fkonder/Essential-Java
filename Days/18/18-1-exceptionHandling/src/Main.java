import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main(String[] args) {

        try{
                int[] sayilar = new int[]{1,2,3,5};
                System.out.println(sayilar[2]);
                }
        catch(Exception exception){
            System.out.println("Hata oluştu!");
            System.out.println("Hata: " + exception);
        }
        finally {
            System.out.println("Her zaman çalışır");
        }

        

    }
}