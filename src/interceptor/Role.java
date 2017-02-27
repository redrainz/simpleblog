package interceptor;



import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import model.User;

public class Role  extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		User user=(User) arg0.getInvocationContext().getSession().get("user");
	   if(user==null)
		return "roleexit";
	   else return arg0.invoke();
	}

}
