package Tassk3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        ReaderPDL pdl = new ReaderPDL();
        pdl.parse("https://github.com/");
    }
}
