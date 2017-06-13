package com.example.pang.boluomi.Domes;

/**
 * Created by Pang on 2017/6/13.
 */

public class Dome {
    int image;
    String title;
    String content;

    public Dome() {
    }

    @Override
    public String toString() {
        return "Dome{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Dome(int image, String title, String content) {
        this.image = image;
        this.title = title;
        this.content = content;
    }
}
