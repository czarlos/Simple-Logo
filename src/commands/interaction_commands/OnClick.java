package commands.interaction_commands;

import parser.Parser;
import model.Model;
import commands.Command;
import commands.basic_syntax.Variable;

public class OnClick extends Command {
	
	@Override
	public double evaluate(Model model) {
		Parser parser = new Parser(null);
		Command customCommand = null;
		try {
			customCommand = parser.getClass("SetXY");
			//customCommand = parser.getClass(model.getCustomCommandMap().get("OnClick"));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		setVariables(customCommand, model);
		customCommand.evaluate(model);

		return myNumInputs;	
	}
	
	public void setVariables(Command customCommand, Model model) {
		Variable x = new Variable("X");
		x.setVariableValue(getInputValueOne(model));
		model.addVariable(x.getVariableName(), x.getVariableValue());
		
		Variable y = new Variable("Y");
		y.setVariableValue(getInputValueTwo(model));
		model.addVariable(y.getVariableName(), y.getVariableValue());
		
		customCommand.setLeftChild(x);
		customCommand.setRightChild(y);
	}
}
