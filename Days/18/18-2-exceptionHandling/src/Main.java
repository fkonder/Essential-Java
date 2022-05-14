import java.nio.channels.ScatteringByteChannel;

public class Main {
    public static void main(String[] args) {

        try{
                int[] sayilar = new int[]{1,2,3,5};
                System.out.println(sayilar[5]);
                }
        catch(StringIndexOutOfBoundsException exception){
            System.out.println("Hata oluştu!");
            System.out.println("Hata: " + exception);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata oluştu!");
            System.out.println("Hata: " + exception);
        }catch(Exception exception){
            System.out.println("Hata oluştu!");
            System.out.println("Loglandı: " + exception);
        }

        finally {
            System.out.println("Her zaman çalışır");
        }

        

    }
}