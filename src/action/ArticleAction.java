package action;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.Article;
import model.User;
import survice.ArticleSurvice;

public class ArticleAction extends ActionSupport{
private ArticleSurvice articlesurvice;

private String title;
private String content;
private String describes;
private int id;
private File movie;
private String movieFileName;
private String movieContentType;
private String savePath;

public String getFilename() throws UnsupportedEncodingException {


	return new String(savePath.getBytes(),"ISO-8859-1");
}



public String getMovieFileName() {
	return movieFileName;
}

public void setMovieFileName(String movieFileName) {
	this.movieFileName = movieFileName;
}

public String getMovieContentType() {
	return movieContentType;
}

public void setMovieContentType(String movieContentType) {
	this.movieContentType = movieContentType;
}

public String getSavePath() {
	return savePath;
}

public void setSavePath(String savePath) {
	this.savePath = savePath;
}

public File getMovie() {
	return movie;
}

public void setMovie(File movie) {
	this.movie = movie;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getDescribes() {
	return describes;
}

public void setDescribes(String describes) {
	this.describes = describes;
}

public ArticleSurvice getArticlesurvice() {
	return articlesurvice;
}

public void setArticlesurvice(ArticleSurvice articlesurvice) {
	this.articlesurvice = articlesurvice;
}

public String filegai() throws IOException{
	savePath="C:\\tomcat8\\webapps\\simpleblog\\upload";
	FileOutputStream fos=new FileOutputStream(savePath+"\\"+movieFileName);
	FileInputStream fis=new FileInputStream(movie);
	byte[] buffer=new byte[110000000];
	//System.out.println(buffer.length);
	int len=0;
	while((len=fis.read(buffer))>0)
		fos.write(buffer,0,len);
	return movieFileName;
}
public InputStream getDownload() throws IOException{
	File f=new File("C:\\tomcat8\\webapps\\simpleblog\\upload\\"+savePath);
	
	InputStream in=new FileInputStream(f);
	
	return in;
}

public String queryall(){
	List list=articlesurvice.query();
	  ActionContext.getContext().getValueStack().push(list);
	  
	  return SUCCESS;
	
}
  public String write() throws IOException{
	 User user= (User) ActionContext.getContext().getSession().get("user");
	  Article article=new Article();
	  article.setUser(user);
	  article.setDate(new Date());
	  article.setDescribes(describes);
      article.setTitle(title);
      article.setContent(content);
      if(movie!=null)
      article.setMovie(filegai());
      
      articlesurvice.add(article);
	  return SUCCESS;
	  
  } 
  public String query(){
	  User user= (User) ActionContext.getContext().getSession().get("user");
	  List list=articlesurvice.query(user.getId());
	  ActionContext.getContext().getValueStack().push(list);
	  
	  return SUCCESS;
  }
  public String oneget(){
	  
	  ActionContext.getContext().getValueStack().push(articlesurvice.get(id));
	  return SUCCESS;
  }
  public String hponeget(){
	  Article article=articlesurvice.get(id);
	  //ActionContext.getContext().getValueStack().push(article);
	  ActionContext.getContext().getSession().put("article", article);
	  return SUCCESS;
  }
  public String oneupdate(){
	  Article article=articlesurvice.get(id);
	  article.setDate(new Date());
	  article.setDescribes(describes);
      article.setTitle(title);
      article.setContent(content);
      articlesurvice.update(article);
	 
	  return SUCCESS;
  }
  public String onedalete(){
	  
	  articlesurvice.delete(id);
	  
	  return SUCCESS;
	  
  }
  public String moviestart(){
	  String s=savePath;
	  Article a=new Article();
	  a.setMovie(s);
	  ActionContext.getContext().getValueStack().push(a);
	return SUCCESS;  
  }
	
}
