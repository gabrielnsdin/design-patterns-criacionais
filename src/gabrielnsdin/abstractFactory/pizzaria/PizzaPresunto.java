package gabrielnsdin.abstractFactory.pizzaria;

import java.util.Arrays;

public class PizzaPresunto implements Pizza{
	
	static final String[] INGREDIENTES = {"Queijo", "Calabresa", "Tomate"};
	
	@Override
	public String listarIngredientes() {
		return Arrays.toString(INGREDIENTES);
	}

}
