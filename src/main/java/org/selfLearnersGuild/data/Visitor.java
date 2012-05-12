package org.selfLearnersGuild.data;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Visitor implements Serializable {

	private static final long serialVersionUID = -9063595804429769734L;
	
	private Object visitorSelection;

	@PostConstruct
	private void initiallize(){
		visitorSelection = null;		
	}
	public Object getVisitorSelection() {
		return visitorSelection;
	}

	public void setVisitorSelection(Object visitorSelection) {
		this.visitorSelection = visitorSelection;
	}
}
