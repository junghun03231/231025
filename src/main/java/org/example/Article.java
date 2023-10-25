package org.example;

public class Article {
    long id;
    String title;
    String body;

    public Article(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return this.id;
    }

    void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    void setBody(String body) {
        this.body = body;
    }
}
