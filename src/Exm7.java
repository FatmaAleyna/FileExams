import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exm7 {

    // 7. bulunan dosyadan veri okuma

    public static void main(String[] args) throws IOException {

        File f=new File("aHarfi.dat");
        Scanner scan=new Scanner(f);

        String str="";

        while (scan.hasNext()) {
            str=scan.nextLine();
            System.out.println(str);
        }
        scan.close();

    }
}
