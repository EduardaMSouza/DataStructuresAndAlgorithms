package Thirteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/eduarda/Área de Trabalho");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/eduarda/Área de Trabalho/teste.txt"));
        String line;
        String fileLines = "";
        while ((line = bufferedReader.readLine()) != null) {
            fileLines +=  line + "\n";
        }
        System.out.println(fileLines);
    }
}