import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm6 {

    // 6. klavyeden girilen stringler içerisinde a harfi ile başlayan stringleri aHarfi.dat dosyasına yazan programı yapınız
    // 5 giriş yapılacaktır

    public static void main(String[] args) throws IOException {

        Scanner k=new Scanner(System.in);

        File f=new File("aHarfi.dat");
        PrintWriter pr=new PrintWriter(f);

        for (int i = 0; i <5 ; i++) {

            String str = k.nextLine();

                if (str.charAt(0) == 'a') {
                    pr.println(str);
                } else ;
            }
        pr.close();
    }
}
