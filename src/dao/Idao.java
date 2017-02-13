package dao;

import java.util.List;

public interface Idao<T> {
public void add(T t);
public T get(int id);
public void update(T t);
public void delete(int id);
public List<T> query();
public List<T> query(int firstResult,int maxResult);

}
