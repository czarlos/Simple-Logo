package commands.vcu;

import java.util.List;

import model.Constants;
import model.Model;
import commands.Command;

/**
 * Basic class for loop commands
 * @author Kevin
 *
 */
public class Loop extends Command{
	protected int myIteration;
	protected int myIncrement;
	protected int myMax;
	protected List<Command> myCommandList;
	
	@Override
	public double evaluate(Model model) {
		while(getIteration(model)<getMax()) {
			for (Command c:myCommandList) {
				c.evaluate(model);
			}
			incrementIteration(model);
		}
		return 0;
	}
	
	public void setIteration(int iteration) {
		myIteration = iteration;
	}
	
	public int getIteration(Model model) {
		return myIteration;
	}
	
	public void incrementIteration(Model model) {
		myIteration += myIncrement;
	}
	
	public void setMax(int max) {
		myMax = max;
	}
	
	public int getMax() {
		return myMax;
	}
	
	public void setCommandList(List<Command> commandList) {
		myCommandList = commandList;
	}

	public List<Command> getCommandList() {
		return myCommandList;
	}
	
	public void setIncrement(int increment) {
		myIncrement = increment;
	}
	
	public int getIncrement() {
		return myIncrement;
	}
}