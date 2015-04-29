package com.ec327.chatterbox.chatterbox;

public class Thread {

    private String Id;
    private String title;
    private String season;
    private String episode;
    private String writer;
    private String content;
    private String comments;

    Thread(String threadId, String threadTitle, String threadSeason, String threadEpisode, String threadWriter, String threadContent, String threadComments) {
        Id = threadId;
        title = threadTitle;
        season = threadSeason;
        episode = threadEpisode;
        writer = threadWriter;
        content = threadContent;
        comments = threadComments;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public void setSeason(String season) {
        this.season = season;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString(){
        return "S" + this.getSeason() + " E" + this.getEpisode() + " - " + this.getTitle();
    }
}
