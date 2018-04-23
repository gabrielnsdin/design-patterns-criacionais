package gabrielnsdin.abstractFactory.pizzaria;

import java.util.Arrays;

public class CalzonePresunto implements Calzone{
	
private static final String[] INGREDIENTES = {"Queijo", "Presunto", "Tomate"};
	
	@Override
	public String listarIngredientes() {
		return Arrays.toString(INGREDIENTES);
	}
}
