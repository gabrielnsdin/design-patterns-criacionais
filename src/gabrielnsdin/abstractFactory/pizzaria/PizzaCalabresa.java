package gabrielnsdin.abstractFactory.pizzaria;

import java.util.Arrays;

public class PizzaCalabresa implements Pizza{
	
	private static final String[] INGREDIENTES = {"Queijo", "Presunto", "Tomate"};
	
	@Override
	public String listarIngredientes() {
		return Arrays.toString(INGREDIENTES);
	}

}
