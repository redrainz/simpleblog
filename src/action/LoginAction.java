package action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.User;
import survice.UserSurvice;

public class LoginAction extends ActionSupport {
	private UserSurvice usersurvice;
	private String loginzhuce;
	 public void setLoginzhuce(String loginzhuce) {
		this.loginzhuce = loginzhuce;
	}

	private String password;
	 private String nickname;
	 public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserSurvice getUsersurvice() {
		return usersurvice;
	}

	public void setUsersurvice(UserSurvice usersurvice) {
		this.usersurvice = usersurvice;
	}

	public String login(){
		 if(!(loginzhuce.equals("")))
			 return "zhuce";
		User user=usersurvice.get(nickname); 
		if(user!=null&& user.getPassword().equals(password))
		 {
			 ActionContext.getContext().getSession().put("user", user);
			 return SUCCESS;
		 }
			 else return "loginwrong";
		
	 
	 }
	
	public String zhuce(){
		User user=usersurvice.get(nickname);
		
		if(user!=null)
		{
			ServletActionContext.getRequest().setAttribute("exist","1");
			return "zhuce";
		}
			else 
		{
			User u=new User();
			u.setNickname(nickname);
			u.setPassword(password);
			u.setRole("common");
			usersurvice.add(u);
			 ActionContext.getContext().getSession().put("user", u);
			return SUCCESS;			
		}
	
		
	}
	
	public String exit(){
		 ActionContext.getContext().getSession().clear();
		return SUCCESS;
	}

}
