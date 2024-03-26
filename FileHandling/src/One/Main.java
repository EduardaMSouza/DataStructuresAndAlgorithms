package One;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("/home/eduarda/Área de Trabalho");
        String[] contents = newFile.list();
        for (String content: contents) {
            System.out.println(content);
        }
    }
}