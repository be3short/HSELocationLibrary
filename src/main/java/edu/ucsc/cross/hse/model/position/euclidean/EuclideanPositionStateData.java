package edu.ucsc.cross.hse.model.position.euclidean;

import edu.ucsc.cross.hse.core.framework.component.Component;
import edu.ucsc.cross.hse.core.framework.data.State;
import edu.ucsc.cross.hse.model.position.general.Position;
import edu.ucsc.cross.hse.model.position.general.PositionState;

public class EuclideanPositionStateData extends Component implements PositionState, Position
{

	public State xPosition; // x position state
	public State yPosition; // y position state
	public State zPosition; // z position state

	/*
	 * Constructor with position defined
	 */
	public EuclideanPositionStateData(Double x_position, Double y_position, Double z_position)
	{
		super("Euclidean Position State");
		instantiateElements(x_position, y_position, z_position);
	}

	/*
	 * Constructor without position defined
	 */
	public EuclideanPositionStateData()
	{
		super("Euclidean Position State");
		instantiateElements(0.0, 0.0, 0.0);
	}

	/*
	 * Instantiates the state elements
	 */
	private void instantiateElements(Double x_position, Double y_position, Double z_position)
	{
		xPosition = new State("X Position", x_position);
		yPosition = new State("Y Position", y_position);
		zPosition = new State("Z Position", z_position);
	}

	/*
	 * Get the the x state component
	 */
	@Override
	public State getXPositionState()
	{
		return xPosition;
	}

	/*
	 * Get the the y state component
	 */
	@Override
	public State getYPositionState()
	{

		return yPosition;
	}

	/*
	 * Get the the z state component
	 */
	@Override
	public State getZPositionState()
	{
		// TODO Auto-generated method stub
		return zPosition;
	}

	/*
	 * Get the value of the x state component
	 */
	@Override
	public Double getXPosition()
	{
		// TODO Auto-generated method stub
		return xPosition.getValue();
	}

	/*
	 * Get the value of the y state component
	 */
	@Override
	public Double getYPosition()
	{
		// TODO Auto-generated method stub
		return yPosition.getValue();
	}

	/*
	 * Get the value of the z state component
	 */
	@Override
	public Double getZPosition()
	{
		// TODO Auto-generated method stub
		return zPosition.getValue();
	}

	@Override
	public boolean isNullPosition()
	{
		// TODO Auto-generated method stub
		return xPosition.getValue() == null;
	}
}
