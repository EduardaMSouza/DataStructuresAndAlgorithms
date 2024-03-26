package Seven;
import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/eduarda/Área de Trabalho");
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}