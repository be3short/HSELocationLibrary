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

	public static Double computeDirectDistance(Position a, Position b)
	{
		Double distance = Math.sqrt(Math.pow((a.getXPosition() - b.getXPosition()), 2)
		+ Math.pow((a.getYPosition() - b.getYPosition()), 2) + Math.pow((a.getZPosition() - b.getZPosition()), 2));
		return distance;
	}

	public static Double computeHorizontalDistance(Position a, Position b)
	{
		Double distance = Math
		.sqrt(Math.pow((a.getXPosition() - b.getXPosition()), 2) + Math.pow((a.getYPosition() - b.getYPosition()), 2));
		return distance;
	}

	public static Double computeVerticalDistance(Position a, Position b)
	{
		Double distance = a.getZPosition() - b.getZPosition();
		return distance;
	}
}
