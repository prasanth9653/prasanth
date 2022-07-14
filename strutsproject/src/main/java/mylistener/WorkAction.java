package mylistener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dbpack.DBConnection;

/**
 * Application Lifecycle Listener implementation class WorkAction
 *
 */
@WebListener
public class WorkAction implements HttpSessionListener {

    
    public void sessionCreated(HttpSessionEvent se)  { 
        System.out.println("session created....");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("Session Destroyed");
         DBConnection con=new DBConnection();
         HttpSession session=se.getSession();
         Object obj=session.getAttribute("ename");
         if(obj!=null)
         {
        	 String ename=obj.toString();
        	 con.updateFlag(ename, 0);
         }
    }
	
}
