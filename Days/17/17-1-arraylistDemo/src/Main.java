import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("ankara");
        //System.out.println(sayilar.size());
        sayilar.remove(0);
        System.out.println(sayilar.get(1));

        sayilar.set(1,100);
        System.out.println(sayilar.get(1));
        System.out.println("*************");
        for(Object i:sayilar)
            System.out.println(i);
    }
}