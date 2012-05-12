package org.selfLearnersGuild.data.biek;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("biek")
@SessionScoped
public class BIEK implements Serializable {

	private static final long serialVersionUID = -3529917579904606671L;

	private Object visitorPanelMenuSelection;

	@PostConstruct
	@SuppressWarnings("unused")
	private void postConstructionInitiallize() {
		visitorPanelMenuSelection = null;
	}

	// Getter And Setters
	public Object getVisitorPanelMenuSelection() {
		return visitorPanelMenuSelection;
	}

	public void setVisitorPanelMenuSelection(Object visitorPanelMenuSelection) {
		this.visitorPanelMenuSelection = visitorPanelMenuSelection;
	}
}