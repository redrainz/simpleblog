package survice;

import java.util.List;

import dao.Idao;
import dao.Iuserdao;
import dao.UserDao;
import model.User;

public class UserSurvice {
private Iuserdao userdao;
public Iuserdao getUserdao() {
	return userdao;
}

public void setUserdao(Iuserdao userdao) {
	this.userdao = userdao;
}

public User get(int id){
	User user=(User) userdao.get(id);
	  
	return user;
	
}

public User get(String nickname){

	List list=userdao.query();
	for(Object u:list)
		if(((User)u).getNickname().equals(nickname))  
	      return (User)u;
		return null;
}
public void add(User user){
	userdao.add(user);
	
}
}
