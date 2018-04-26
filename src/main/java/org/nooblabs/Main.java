package org.nooblabs;

import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;


class Main{
    public static void main(String[] args) {
        
        // String html = "<html><head><title>First parse</title></head>"
        // + "<body><p>Parsed HTML into a doc.</p></body></html>";
        // Document doc = Jsoup.parse(html);
        // Elements paras = doc.select("p");
        // for(Element para : paras){
        //     System.out.println(para.text());
        // }
        // System.out.println(doc.text());
        String urlStr = "http://a.fanfox.net/store/manga/25819/001.0/compressed/vimg006_004.jpg?token=445832330cfc9fcdde0d9411d7103f4e99c9d068&ttl=1524693600";
        FileDownloader.init(urlStr, "asd.jpg", "/home/sourabh");
    }
}