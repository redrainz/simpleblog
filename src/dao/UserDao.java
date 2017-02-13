package dao;

import java.util.List;

import model.User;

public class UserDao extends DaoUtil implements Iuserdao<User>{

	
	public void add(User t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}

	public User get(int id) {
		// TODO Auto-generated method stub
		return (User)getSession().get(User.class, id);
	}
	

	public void update(User t) {
		// TODO Auto-generated method stub
		getSession().update(t);
	}

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		User u=get(id);
		if(u!=null)
		getSession().delete(u);
	}

	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from User").list();
	}

	@Override
	public List<User> query(int firstResult, int maxResult) {
		// TODO Auto-generated method stub
		return getSession().createQuery("from User").setFirstResult(firstResult).setMaxResults(maxResult).list();
	}

	

}
