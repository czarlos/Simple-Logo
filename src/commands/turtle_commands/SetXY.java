package commands.turtle_commands;

import model.Model;
import model.State;
import commands.Command;

public class SetXY extends Command {

	@Override
	public double evaluate(Model model) {
		double x = model.getX();
		double y = model.getY();
		model.addState(new State(getInputValueOne(), getInputValueTwo(), model.getOrientation(), model.getTurtleVisible(), model.getPenVisible()));
		return calculateLength(x, y, getInputValueOne(), getInputValueTwo());
	}
	
	private double calculateLength(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 
	}

}
