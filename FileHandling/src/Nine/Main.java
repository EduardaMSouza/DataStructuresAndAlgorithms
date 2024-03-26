package Nine;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/eduarda/Área de Trabalho");
        System.out.println(file.getTotalSpace());
    }
}