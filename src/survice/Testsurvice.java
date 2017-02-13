package survice;

import java.util.List;

import dao.Idao;
import dao.UserDao;

public class Testsurvice {
	private Idao userdao;

	public Idao getUserdao() {
		return userdao;
	}

	public void setUserdao(Idao userdao) {
		this.userdao = userdao;
	}
	
public List add(){
	return userdao.query();
	
	
}
}
