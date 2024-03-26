package Twelve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/eduarda/Área de Trabalho");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/eduarda/Área de Trabalho/teste.txt"));
        String line;
        List<String> fileLines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            fileLines.add(line);
        }
        System.out.println(fileLines);
    }
}