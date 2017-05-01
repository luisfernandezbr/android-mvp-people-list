package br.com.luisfernandezbr.challenge99.pojo;


import java.io.Serializable;

public class AppFormattedDate implements Serializable {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}
