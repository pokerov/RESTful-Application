package org.dimov.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {

    private String author;
    private Date time;
    private String comments;
    private Integer id;
    private String href;

    public Message () {}

    public Message (Integer id, String author, String comments, String href, Date time) {
        this.id = id;
        this.author = author;
        this.comments = comments;
        this.time = time;
        this.href = href;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
