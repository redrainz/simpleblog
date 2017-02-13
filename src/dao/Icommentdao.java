package dao;

import java.util.List;

public interface Icommentdao<T> extends Idao<T> {
	public List<T> query(int articleid,int firstResult,int maxResult);
	

}
