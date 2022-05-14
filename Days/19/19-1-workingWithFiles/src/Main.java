import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File("students.txt");
        try {
            if (file.createNewFile())
                System.out.println("Dosta oluşturuldu");
            else
                System.out.println("Dosya zaten var!");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}