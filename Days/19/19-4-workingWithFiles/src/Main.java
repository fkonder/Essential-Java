import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

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

    public static void readFile(){
        File file = new File("students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true));
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}