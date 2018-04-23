package gabrielnsdin.abstractFactory.pizzaria;

public class PizzaioloMassasFactory implements Pizzaiolo{

	@Override
	public Pizza getPizzaInstance(String data) {
		
		String semana = Util.getDay(data);
		
		if(semana.equals("SUNDAY")) {
			System.out.println("Pizzaria Fechada");
			
			return null;
		}else if(semana.equals("MONDAY") || semana.equals("WEDNESDAY") || semana.equals("FRIDAY")) {
			return new PizzaCalabresa();
		}else if(semana.equals("TUESDAY") || semana.equals("THURSDAY") || semana.equals("SATURDAY")) {
			return new PizzaPresunto();
		}
	
		return null;
	}

	@Override
	public Calzone getCalzoneInstance(String data) {
		String semana = Util.getDay(data);
		
		if(semana.equals("SUNDAY")) {
			System.out.println("Pizzaria Fechada");
			
			return null;
		}else if(semana.equals("MONDAY") || semana.equals("WEDNESDAY") || semana.equals("FRIDAY")) {
			return new CalzoneCalabresa();
		}else if(semana.equals("TUESDAY") || semana.equals("THURSDAY") || semana.equals("SATURDAY")) {
			return new CalzonePresunto();
		}
	
		return null;
	}
	
	
	
}
