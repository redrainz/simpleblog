package test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Idao;
import model.Article;
import model.Comment;
import model.User;
import survice.ArticleSurvice;
import survice.Testsurvice;
import survice.UserSurvice;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Idao<User> a=ctx.getBean("userdao",Idao.class);
		Idao<Article> a1=ctx.getBean("articledao",Idao.class);
		Idao<Comment> a2=ctx.getBean("commentdao",Idao.class);
		User user=new User();
		Comment comment =new Comment();
		Article article=new Article();
		 comment.setContent("sfdds");
		 comment.setDate(new Date());
		article.setDate(new Date());
		article.setDescribes("aa");
		article.setContent("dsfs");
		article.setTitle("dsfs");
	    article.getComments().add(comment);
	    article.setUser(user);
		
	   
		comment.setArticle(article);
		
		comment.setUser(user);
	
		user.setNickname("dasda");
		user.getArticles().add(article);
	a.add(user);
		
	a1.add(article);
		
		a2.add(comment);
		
		
		System.out.println(user.getId());
	}
	@org.junit.Test
	public void test1(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		 UserSurvice a=ctx.getBean("usersurvice",UserSurvice.class);
		 User user=new User();
		 user.setNickname("fdsf");
		 user.setPassword("fsd");
		a.add(user);
	     System.out.println(user.getId());
	
	}
	
	@org.junit.Test
	public void test11(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		ArticleSurvice a=ctx.getBean("articlesurvice",ArticleSurvice.class);
		List list=a.query();
		for(Object u:list)
	     System.out.println(((Article)u).getComments());
	
	}
	@org.junit.Test
	public void test11q(){
		String savePath="C:\\tomcat8\\webapps\\simpleblog\\WEB-INF\\upload\\360se.exe";
		
		
		String filename=savePath.replace("C:\\tomcat8\\webapps\\simpleblog\\WEB-INF\\upload\\", "");
		System.out.println("dsad"+filename);
		
}}
