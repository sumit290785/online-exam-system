
package com.onlineexam.web;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * @author Joel Tsai
 *
 */
public class FinishExamForm {

	public String backToSelectCategory() {
		return "SELECT_CATEGORY";
	}
	
	public String exit() {
		try {
			((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false)).invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "EXIT";
	}

}
