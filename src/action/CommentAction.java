package action;


import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.Article;
import model.Comment;
import model.User;

import survice.CommentSurvice;

public class CommentAction extends ActionSupport {
private CommentSurvice commentsurvice;
private String content1;
public String getContent1() {
	return content1;
}



public void setContent1(String content1) {
	this.content1 = content1;
}



public CommentSurvice getCommentsurvice() {
	return commentsurvice;
}



public void setCommentsurvice(CommentSurvice commentsurvice) {
	this.commentsurvice = commentsurvice;
}
public String add() {
	Comment comment=new Comment();
	comment.setUser((User)(ActionContext.getContext().getSession().get("user")));
	comment.setContent(content1);
	comment.setDate(new Date());
	System.out.println(new Date());
	comment.setArticle((Article)(ActionContext.getContext().getSession().get("article")));
	((Article)(ActionContext.getContext().getSession().get("article"))).getComments().add(comment);
	commentsurvice.add(comment);
	System.out.println(content1);
	return SUCCESS;
}

}
