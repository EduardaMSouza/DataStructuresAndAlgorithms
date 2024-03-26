package Ten;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/eduarda/Área de Trabalho");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/eduarda/Área de Trabalho/teste.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line.getBytes());
        }
    }
}