package commands.math;

import commands.OneInput;

/**
 * takes the log of the input value
 * @author Kevin
 *
 */
public class Log extends OneInput{

	@Override
	public double evaluate() {
		return Math.log(getInputValueOne());
	}

}
