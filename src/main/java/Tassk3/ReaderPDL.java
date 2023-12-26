package Tassk3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ReaderPDL {
    @SneakyThrows
    public void parse(String urlAddress) {
        Document document = Jsoup.connect(urlAddress).get();
        System.out.println("Document title: " + document.title());

        Elements description = document.select("meta[name=description]");
        System.out.println("Description: " + description.attr("content"));

        Elements title = document.select("title");
        System.out.println("Title: " + title.text());

        String logo = document.select("link[rel$=icon]").attr("href");
        if (logo.startsWith("/")) {
            logo = urlAddress + logo;
        }
        System.out.println("Logo: " + logo);
    }
}
