import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm8 {

    // karışık.dat dosyasında sayılar ve stringler bulunmkatradır
    // sayıları sayı.dat dosyasına, stringleri alıp string.dat dosyasına yazan programı yapınız

    public static void main(String[] args) throws IOException {

        File karisik = new File("karışık.dat");
        PrintWriter pr1 = new PrintWriter(karisik);
        Scanner scan = new Scanner(karisik);
        Scanner k = new Scanner(System.in);
        String str;

        for (int i = 0; i < 5; i++) {
            str = k.nextLine();
            pr1.println(str);
        }
        pr1.close();

        File sayi = new File("sayı.dat");
        PrintWriter pr2 = new PrintWriter(sayi);

        File string = new File("string.dat");
        PrintWriter pr3 = new PrintWriter(string);

        while (scan.hasNext()) {
            str = scan.nextLine();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    pr2.println(str);
                } else {
                    pr3.println(str);
                }
        }
    }
        scan.close();
        pr2.close();
        pr3.close();
    }
}
