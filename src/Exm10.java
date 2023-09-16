import java.util.*;
import java.io.*;
public class Exm10 {

    // 10. klavyeden girilen stringler içerisinde ilk harfi a olan kelimeleri
    // aharfi.dat dosyasına yazan java kodu
    // a harfiyle başlayan kelimelerin saysısı 5 olunca duran

    public static void main(String[] args) throws IOException {
        Scanner k = new Scanner(System.in);

        int sayac = 0;
        System.out.println("kelimeler giriniz");

        File f = new File("aharfi.dat");
        PrintWriter pr = new PrintWriter(f);
        
        while (true) {
            String s = k.nextLine();
            if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
                pr.println(s);
                sayac++;
                if (sayac == 5) {
                    pr.println(s);
                    System.out.println("program sonlandı,teşekkürler");
                    break;
                }
            }
        }
        pr.close();
    }
}
