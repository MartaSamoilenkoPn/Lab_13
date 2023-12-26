package Tassk3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDL pdl = new PDL();
        pdl.parse("https://cms.ucu.edu.ua/?redirect=0");
    }
}
