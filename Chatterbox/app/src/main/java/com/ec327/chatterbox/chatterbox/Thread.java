package com.ec327.chatterbox.chatterbox;

/**
 * Created by Mason D. Hahn on 4/27/2015.
 */
public class Thread {

    private String id;
    private String title;
    private String season;
    private String content;

    Thread(String threadId, String threadTitle) {
        id = threadId;
        title = threadTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String title) {
        this.season = season;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return this.getTitle();
    }
}
