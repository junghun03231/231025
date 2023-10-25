package org.example;

public class Article {
    long id;
    String title;
    String body;
    public Article(long id, String title, String body)  {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }
    void setId(long id) {
        this.id = id;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setBody(String body) {
        this.body = body;
    }
}
