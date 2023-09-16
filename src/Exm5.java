import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm5 {

    // 5. klavyeden 5 sayı giriliyor
    // girilen sayı çift ise çift.dat,
    // tek ise tek.dat dosyasına yazan programı yapınız

    public static void main(String[] args) throws IOException {

        Scanner k=new Scanner(System.in);

        File f1=new File("çift.dat");
        PrintWriter pr1=new PrintWriter(f1);

        File f2=new File("tek.dat");
        PrintWriter pr2=new PrintWriter(f2);

        for (int i = 0; i <5 ; i++) {

            int girilen=k.nextInt();

            if (girilen%2==0){
                pr1.println(girilen);
            }else{
                pr2.println(girilen);
            }
        }
        pr1.close();
        pr2.close();
    }
}
