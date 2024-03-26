package Two;
import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        File newFile = new File("/home/eduarda/Área de Trabalho");
        FilenameFilter filter = (dir, name) ->  name.endsWith(".pdf");
        String[] contents = newFile.list(filter);
        for (String content: contents) {
            System.out.println(content);
        }
    }
}