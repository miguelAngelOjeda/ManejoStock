/**
 * 
 */
package ShiroUserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Miguel
 *
 */
@Service("ShiroUserService")
public class ShiroUserService {
	private Context context;
	
	public void authenticate(String username,String password) throws IncorrectCredentialsException, UnauthenticatedException {
		  //logeer.debug("Perform authentication for user {}",username);
		  UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		  Subject subject=SecurityUtils.getSubject();
		  try {
		    subject.login(token);
		  }
		 catch (  UnknownAccountException e) {
//		    log.debug("UnknownAccountException");
//		    throw new InvalidAccountException();
		  }
		catch (  IncorrectCredentialsException e) {
//		    log.debug("IncorrectCredentialsException");
//		    throw new InvalidCredentialsException();
		  }
		catch (  LockedAccountException e) {
//		    log.debug("LockedAccountException");
//		    throw new UserLockedException();
		  }
		catch (  AuthenticationException e) {
//		    log.error("AuthenticationException: {}",e.getMessage());
//		    throw new InvalidCredentialsException();
		  }
		}
	
//	protected boolean checkAccess(Subject subject){
//		  if (logical == Logical.AND) {
//		    return subject.isPermittedAll(requiredPermissions);
//		  }
//		 else {
//		    for (    Permission permission : requiredPermissions) {
//		      if (subject.isPermitted(permission)) {
//		        return true;
//		      }
//		    }
//		    return false;
//		  }
//		}

}