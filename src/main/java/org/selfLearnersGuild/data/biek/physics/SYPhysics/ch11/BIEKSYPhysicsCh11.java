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
	private BIEKSYPhysicsCh11.Exercise exercise;

	@PostConstruct
	public void postConstructionInitiallize() {
		this.stepNumber = null;
		this.visitorNumericalSelection = null;
		this.examples = new BIEKSYPhysicsCh11.Examples();
		this.exercise = new BIEKSYPhysicsCh11.Exercise();
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

		private boolean solvedExample11_1;
		private boolean solvedExample11_2;
		private boolean solvedExample11_3;
		
		public boolean isSolvedExample11_1() {
			return solvedExample11_1;
		}
		public void setSolvedExample11_1(boolean solvedExample11_1) {
			this.solvedExample11_1 = solvedExample11_1;
		}
		public boolean isSolvedExample11_2() {
			return solvedExample11_2;
		}
		public void setSolvedExample11_2(boolean solvedExample11_2) {
			this.solvedExample11_2 = solvedExample11_2;
		}
		public boolean isSolvedExample11_3() {
			return solvedExample11_3;
		}
		public void setSolvedExample11_3(boolean solvedExample11_3) {
			this.solvedExample11_3 = solvedExample11_3;
		}
	}
	
	/**
	 * <p>
	 * Till now the Main purpose of this inner class is only to hold the
	 * 'solved' state of a numerical.
	 * </p>
	 * 
	 * @author Affan Hasan
	 */
	public class  Exercise {
		private boolean solvedProblem11_1;
		private boolean solvedProblem11_2;
		private boolean solvedProblem11_3;
		
		public boolean isSolvedProblem11_1() {
			return solvedProblem11_1;
		}
		public void setSolvedProblem11_1(boolean solvedProblem11_1) {
			this.solvedProblem11_1 = solvedProblem11_1;
		}
		public boolean isSolvedProblem11_2() {
			return solvedProblem11_2;
		}
		public void setSolvedProblem11_2(boolean solvedProblem11_2) {
			this.solvedProblem11_2 = solvedProblem11_2;
		}
		public boolean isSolvedProblem11_3() {
			return solvedProblem11_3;
		}
		public void setSolvedProblem11_3(boolean solvedProblem11_3) {
			this.solvedProblem11_3 = solvedProblem11_3;
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

	public BIEKSYPhysicsCh11.Exercise getExercise() {
		return exercise;
	}

	public void setExercise(BIEKSYPhysicsCh11.Exercise exercise) {
		if(exercise == null)
			this.exercise = null;
		else
			this.exercise = exercise;
	}
}