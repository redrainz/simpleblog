package dao;

import java.util.List;

public interface Iarticledao<T> extends Idao<T> {
	public List<T> query(int userid,int firstResult,int maxResult);

}
