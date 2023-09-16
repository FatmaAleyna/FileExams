import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm4 {

    // 4. klavyeden girilen ifadeler içinde sayı olanlarını sayı.dat,
    // karakter olanları karakter.dat dosyasına yazan program
    // toplam 5 giriş yapılacaktır

    public static void main(String[] args) throws IOException {

        File f1=new File("sayı.dat");
        PrintWriter pr1=new PrintWriter(f1);

        File f2=new File("karakter.dat");
        PrintWriter pr2=new PrintWriter(f2);

        Scanner k=new Scanner(System.in);


        for (int i = 0; i <3 ; i++) {
               char c=k.nextLine().charAt(0);

                if (c>='0' && c<='9'){
                    pr1.println(c);
                } else{
                    pr2.println(c);
                }
            }
            pr1.close();
        pr2.close();
        }
    }

