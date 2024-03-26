package Five;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/eduarda/Área de Trabalho/java.pdf");
        if (file.isFile()) {
            System.out.println("Is file");
        }else if (file.isDirectory()){
            System.out.println("Is directory");
        }
        else {
            System.out.println("Doesnt exist");
        }
    }
}