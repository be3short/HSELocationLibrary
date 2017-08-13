package edu.ucsc.cross.hse.model.position.general;

import edu.ucsc.cross.hse.core.framework.data.State;

public interface PositionState
{

	/*
	 * Get the the x state component
	 */
	public State getXPositionState();

	/*
	 * Get the the y state component
	 */
	public State getYPositionState();

	/*
	 * Get the the z state component
	 */
	public State getZPositionState();
}
