/**
 * 
 */
package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author Admin
 *
 */
@ManagedBean (name = "greetbean")
@RequestScoped
public class GreetBean {
	private String greet = "Welcome JSF";;
//	public GreetBean(){
	//	greet = "Welcome JSF2"; 
	//}
	//String greet = new Getgreet(); 
	
	public void setgreet(String greet) { 
		this.greet = greet; 
		}
	public String getgreet() 
	{ 
		return greet; 
	}

}
