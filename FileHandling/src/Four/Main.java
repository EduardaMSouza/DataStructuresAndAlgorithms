package Four;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/eduarda/Área de Trabalho/java.pdf");
        if (file.canRead() && file.canWrite()) {
            System.out.println("Has read and write permissions");
        }else {
            System.out.println("doenst have");
        }
    }
}
