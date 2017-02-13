package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public  class DaoUtil implements Iutil{
       SessionFactory sessionfactory=null;
public  void setSessionfactory(SessionFactory sessionfactory) {
	this.sessionfactory = sessionfactory;
}
 public  Session getSession(){
	 return sessionfactory.getCurrentSession();
 }

}
