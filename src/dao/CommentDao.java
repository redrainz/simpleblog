package dao;

import java.util.List;

import model.Comment;

public class CommentDao extends DaoUtil implements Icommentdao<Comment> {

	
	public void add(Comment t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}

	
	public Comment get(int id) {
		// TODO Auto-generated method stub
		return (Comment)getSession().get(Comment.class, id);
	}

	
	public void update(Comment t) {
		// TODO Auto-generated method stub
		getSession().update(t);
	}

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		Comment com=get(id);
		if(com!=null)
		getSession().delete(com);
	}


	@Override
	public List<Comment> query() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Comment").list();
	}


	@Override
	public List<Comment> query(int firstResult, int maxResult) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Comment").setFirstResult(firstResult).setMaxResults(maxResult).list();
	}


	@Override
	public List<Comment> query(int articleid, int firstResult, int maxResult) {
		// TODO Auto-generated method stub
		return  getSession().createQuery("from Comment where article.id=?")
				.setParameter(1, articleid)
				.setFirstResult(firstResult).setMaxResults(maxResult).list();
	}
}