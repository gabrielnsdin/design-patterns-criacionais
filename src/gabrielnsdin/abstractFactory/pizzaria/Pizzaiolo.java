package gabrielnsdin.abstractFactory.pizzaria;

public interface Pizzaiolo {
	
	Pizza getPizzaInstance(String data);
	Calzone getCalzoneInstance(String data);
}
