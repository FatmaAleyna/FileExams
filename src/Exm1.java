import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exm1 {

    // 1. adSoyad.txt dosyasına adınızı soyadınızı yazan programı yapınız

    public static void main(String[] args) throws IOException {

        File f1=new File("adSoyad");
        PrintWriter pr1=new PrintWriter(f1);

        pr1.println("fatma aleyna doğan");

        pr1.close();
    }
}