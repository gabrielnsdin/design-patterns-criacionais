package gabrielnsdin.abstractFactory.pizzaria;

public class PizzariaTest {
	
	public static void main(String[] args) {
		PizzaioloMassasFactory pf = new PizzaioloMassasFactory();
		Pizza pizza1 = pf.getPizzaInstance("23/04/2018");
		Pizza pizza2 = pf.getPizzaInstance("24/04/2018");
		
		Calzone calzone1 = pf.getCalzoneInstance("25/04/2018");
		Calzone calzone2 = pf.getCalzoneInstance("26/04/2018");
		
		System.out.println("Pizza 1: " + pizza1.listarIngredientes());
		System.out.println("Pizza 2: " + pizza2.listarIngredientes());
		
		System.out.println("Calzone 1: " + calzone1.listarIngredientes());
		System.out.println("Calzone 2: " + calzone2.listarIngredientes());
	}
}
