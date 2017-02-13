package dao;


import java.io.File;
import java.util.List;

import model.Article;

public class ArticleDao extends DaoUtil implements Iarticledao<Article> {

	@Override
	public void add(Article t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}

	@Override
	public Article get(int id) {
		// TODO Auto-generated method stub
		return (Article) getSession().get(Article.class, id);
	}

	@Override
	public void update(Article t) {
		// TODO Auto-generated method stub
		getSession().update(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	  
		Article art=get(id);
		
		
		if(art!=null)
		{	
	File f=new File("C:\\tomcat8\\webapps\\simpleblog\\upload\\"+art.getMovie());
	     if(f.exists())f.delete();		
		getSession().delete(art);
		}
		
	}

	@Override
	public List<Article> query() {
		// TODO Auto-generated method stub
		
		return getSession().createQuery("from Article").list();
	}

	@Override
	public List<Article> query(int firstResult, int maxResult) {
		
		// TODO Auto-generated method stub
		return getSession().createQuery("from Article").setFirstResult(firstResult).setMaxResults(maxResult).list();
	}

	@Override
	public List<Article> query(int userid, int firstResult, int maxResult) {
		// TODO Auto-generated method stub
		return  getSession().createQuery("from Article where user.id=?")
				.setParameter(0, userid)
				.setFirstResult(firstResult).setMaxResults(maxResult).list();
	}



}
