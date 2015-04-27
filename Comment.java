package com.ec327.chatterbox.chatterbox;

import android.app.Activity;

public class Comment extends Activity {

    private String id;
    private String content;

    Comment(String commentID, String CommentContent) {
        id = commentID;
        content = CommentContent;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
