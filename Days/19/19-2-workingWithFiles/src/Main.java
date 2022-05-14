import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        getFileInfo();

    }
    public static void createFile(){
        File file = new File("students.txt");
        try {
            if (file.createNewFile())
                System.out.println("Dosya oluşturuldu");
            else
                System.out.println("Dosya zaten var!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void getFileInfo(){
        File file = new File("students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya yolu: "+file.getPath());
            System.out.println("Dosyaya yazılabilir mi: "+file.canRead());
            System.out.println("Dosya boyutu(byte): "+file.length());
        }
    }
}