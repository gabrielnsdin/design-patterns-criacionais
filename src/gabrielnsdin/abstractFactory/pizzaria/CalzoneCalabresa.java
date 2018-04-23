package gabrielnsdin.abstractFactory.pizzaria;

import java.util.Arrays;

public class CalzoneCalabresa implements Calzone{
	
private static final String[] INGREDIENTES = {"Queijo", "Calabresa", "Tomate"};
	
	@Override
	public String listarIngredientes() {
		return Arrays.toString(INGREDIENTES);
	}
}
