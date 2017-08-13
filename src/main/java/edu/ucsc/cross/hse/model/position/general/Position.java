package edu.ucsc.cross.hse.model.position.general;

public interface Position
{

	/*
	 * Get the x position value
	 */
	public Double getXPosition();

	/*
	 * Get the y position value
	 */
	public Double getYPosition();

	/*
	 * Get the z position value
	 */
	public Double getZPosition();

	/*
	 * Flag indicating if the position is null
	 */
	public boolean isNullPosition();
}
