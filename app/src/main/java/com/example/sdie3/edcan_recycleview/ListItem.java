package com.example.sdie3.edcan_recycleview;

/**
 * Created by sdie3 on 2018-05-14.
 */

public class ListItem {
    String title;
    String content;

    public ListItem(String title, String context) {
        this.title = title;
        this.content = context;
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
}
