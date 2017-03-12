/**
 * 
 */
package Beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "bean1")
@SessionScoped
public class bean implements Serializable{
	private String name;
	private String password;
	public boolean isLogged = false;

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String action(){
		isLogged = true;
		return "forum.xhtml?faces-redirect=true";
	}

}
