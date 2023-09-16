import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm2 {

    // 2. klavyeden girilen 3 kişiye ait ad soyad numara bilgisini bilgi.txt dosyasına yazan programı yapınız

    public static void main(String[] args) throws IOException {

        Scanner k = new Scanner(System.in);

        File f = new File("bilgi.txt");
        PrintWriter pr = new PrintWriter(f);

        for (int i = 0; i <3; i++) {

            String ad_soyad_numara = k.nextLine();

            pr.println(ad_soyad_numara);

        }
        pr.close();
    }
}