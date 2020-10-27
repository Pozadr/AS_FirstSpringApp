package pl.pozadr.springfirstapp;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {
    //@Value("${page-info.author}")
    private String author;
    //@Value("${page-info.creation-date}")
    private int creationDate;


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getCreationDate() {
        return creationDate;
    }

    @EventListener(ApplicationReadyEvent.class)
    void get() {
        System.out.println(author);
        System.out.println(creationDate);
    }

}
