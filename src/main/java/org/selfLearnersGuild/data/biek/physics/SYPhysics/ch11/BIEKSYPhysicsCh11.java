/**
 * This class is the backing bean for phySYCh11.xhtml
 * 
 * @author Affan Hasan
 */
package org.selfLearnersGuild.data.biek.physics.SYPhysics.ch11;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("biekSYPhysicsChEleven")
public class BIEKSYPhysicsCh11 implements Serializable {

	private static final long serialVersionUID = -2460441280488996123L;
	private Integer stepNumber;
	private String visitorNumericalSelection;
	private BIEKSYPhysicsCh11.Examples examples;

	@PostConstruct
	public void postConstructionInitiallize() {
		this.stepNumber = null;
		this.visitorNumericalSelection = null;
		this.examples = new BIEKSYPhysicsCh11.Examples();
	}

	/**
	 * <p>
	 * Till now the Main purpose of this inner class is only to hold the
	 * 'solved' state of a numerical.
	 * </p>
	 * 
	 * @author Affan Hasan
	 */
	public class Examples {

		private boolean solvedEx11_1;
		private boolean solvedEx11_2;
		private boolean solvedEx11_3;

		public boolean isSolvedEx11_1() {
			return solvedEx11_1;
		}

		public void setSolvedEx11_1(boolean solvedEx11_1) {
			this.solvedEx11_1 = solvedEx11_1;
		}

		public boolean isSolvedEx11_2() {
			return solvedEx11_2;
		}

		public void setSolvedEx11_2(boolean solvedEx11_2) {
			this.solvedEx11_2 = solvedEx11_2;
		}

		public boolean isSolvedEx11_3() {
			return solvedEx11_3;
		}

		public void setSolvedEx11_3(boolean solvedEx11_3) {
			this.solvedEx11_3 = solvedEx11_3;
		}
	}

	// Getter And Setters
	public Integer getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(Integer stepNumber) {
		if (stepNumber.equals(-1))
			this.stepNumber = null;
		else
			this.stepNumber = stepNumber;
	}

	public String getVisitorNumericalSelection() {
		return visitorNumericalSelection;
	}

	public void setVisitorNumericalSelection(String visitorNumericalSelection) {
		this.visitorNumericalSelection = visitorNumericalSelection;
	}

	public BIEKSYPhysicsCh11.Examples getExamples() {
		return examples;
	}

	public void setExamples(BIEKSYPhysicsCh11.Examples examples) {
		if (examples == null)
			this.examples = new BIEKSYPhysicsCh11.Examples();
		else
			this.examples = examples;
	}
}
