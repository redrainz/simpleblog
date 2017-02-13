package survice;

import java.util.List;

import dao.ArticleDao;
import dao.Iarticledao;

import model.Article;

public class ArticleSurvice {
	private Iarticledao articledao;

	
	public Iarticledao getArticledao() {
		return articledao;
	}


	public void setArticledao(Iarticledao articledao) {
		this.articledao = articledao;
	}


	public void add(Article article){
		articledao.add(article);
		
	}
	public List query(int userid){
	return	articledao.query(userid, 0, 10);	
	}
	public List query(){
		return	articledao.query();	
		}
public Article get(int articleid){
	return (Article) articledao.get(articleid);
	
}
public void delete(int articleid)
{
	articledao.delete(articleid);
}
public void update(Article article){
	
	articledao.update(article);
}
}
