package Three;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("/home/eduarda/Área de Trabalho/SendSite");
        if (newFile.exists()) {
            System.out.println(newFile);
        }else {
            System.out.println("nao existe");
        }
    }
}