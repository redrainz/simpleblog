package model;

import java.util.ArrayList;
import java.util.List;

public class User {
private int id;
private String account;
private String password;
private String role;
private String nickname;
private List<Article> articles=new ArrayList<Article>();
private List<Comment> comments=new ArrayList<Comment>();
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}

public List<Article> getArticles() {
	return articles;
}
public void setArticles(List<Article> articles) {
	this.articles = articles;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}

}
