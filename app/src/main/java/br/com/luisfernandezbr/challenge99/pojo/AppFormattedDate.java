package br.com.luisfernandezbr.challenge99.pojo;


public class AppFormattedDate {

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
