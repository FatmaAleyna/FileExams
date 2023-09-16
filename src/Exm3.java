import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exm3 {

    // 3. bilgi.txt dosyasına güncelleme yapınız

    public static void main(String[] args) throws IOException {

        File f=new File("bilgi.txt");
        FileWriter fw=new FileWriter(f,true);

        fw.write("dosyayı güncelliyorum ^^");

        fw.close();
    }
}
