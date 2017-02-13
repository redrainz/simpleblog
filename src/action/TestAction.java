package action;

import java.util.List;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import survice.Testsurvice;

public class TestAction extends ActionSupport{
	private Testsurvice t;
public Testsurvice getT() {
		return t;
	}
	public void setT(Testsurvice t) {
		this.t = t;
	}
public String add(){
	
	List list=t.add();
	
	ActionContext.getContext().getSession().put("all", list);
	
	//System.out.println(((String[])ActionContext.getContext().getParameters().get("zhuce"))[0]);
	if(ActionContext.getContext().getParameters().get("zhuce")!=null)
		return "zhuce";
	
	     else return SUCCESS;
	
	
}

}
