package Six;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        File file = new File("/home/eduarda/Área de Trabalho/java.pdf");
        File fileTwo = new File("/home/eduarda/Área de Trabalho/backend.pdf");

        System.out.println(file.compareTo(fileTwo));

}}