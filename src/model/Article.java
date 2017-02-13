package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Article {
private int id;
private Date date;
private String title;
private String describes;
private String content;
private String movie;
private User user;
private List<Comment> comments=new ArrayList<Comment>();

public String getMovie() {
	return movie;
}
public void setMovie(String movie) {
	this.movie = movie;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescribes() {
	return describes;
}
public void setDescribes(String describes) {
	this.describes = describes;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

}
