import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exm9 {

    // karışık.dat dosyasında rakamlar ve stringler bulunmaktadır
    // string.dat dosyası içinde ise sadece stringler bulunmaktadır
    // bu iki dosyayı genel.dat dosyasında birleştirip içeriğini ekrana yazdıran programı yapınız

    public static void main(String[] args) throws IOException {

        String str;

        File genel=new File("genel.dat");
        PrintWriter pr=new PrintWriter(genel);
        Scanner s1=new Scanner(genel);

        File karısık=new File("karışık.dat");
        Scanner s2=new Scanner(karısık);

        while (s2.hasNext()){
            str=s2.nextLine();
            pr.println(str);
        }
        s2.close();
        pr.close();

        File string=new File("string.dat");
        Scanner s3=new Scanner(string);

        while (s3.hasNext()){
            str=s3.nextLine();
            pr.println(str);
        }
        s3.close();

        while (s1.hasNext()){
            str=s1.nextLine();
            System.out.println(str);
        }
        s1.close();
    }
}
