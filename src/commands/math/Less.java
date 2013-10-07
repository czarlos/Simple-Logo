package commands.math;

import model.Model;
import commands.Command;

/**
 * returns 1 if the first input is less than the second input
 * else returns 0
 * @author Kevin
 *
 */
public class Less extends Command {

	@Override
	public double evaluate(Model model) {
		if (getInputValueOne() < getInputValueTwo()) {
			return 1;
		}
		return 0;
	}
	
}
