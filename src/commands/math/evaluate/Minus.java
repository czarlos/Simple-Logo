package commands.math.evaluate;

import commands.OneInput;
import model.Model;

public class Minus extends OneInput{

	@Override
	public double operation(Model model) {
		return -getInputValue();
	}

}